import BaseClass from "../util/baseClass";
import DataStore from "../util/DataStore";
import AccommodationsClient from "../api/accommodationsClient";

/**
 * Logic needed for the view playlist page of the website.
 */
class AccommodationPage extends BaseClass {

    constructor() {
        super();
        this.bindClassMethods(['onGet', 'onGetAll', 'onCreate', 'renderAccommodations', 'renderAllAccommodations'], this);
        this.dataStore = new DataStore();
    }

    /**
     * Once the page has loaded, set up the event handlers and fetch the accommodation list.
     */
    async mount() {
        document.getElementById('get-by-id-form').addEventListener('submit', this.onGet);
        document.getElementById('create-form').addEventListener('submit', this.onCreate);
        document.getElementById('get-all-form').addEventListener('submit', this.onGetAll);
        this.client = new AccommodationsClient();

        this.dataStore.addChangeListener(this.renderAccommodations)
    }

    // Render Methods --------------------------------------------------------------------------------------------------

    async renderAllAccommodations() {
            let resultArea = document.getElementById("result-info2");

            const accommodations = this.dataStore.get("accommodationsAll");
            console.log("look here for dataStore thing");
            //console.log(accommodations);
            console.log(accommodations[0]);
            if (accommodations) {
                resultArea.innerHTML = `
                    <div>
    ${accommodations.map((accommodation) => ` <div>
                                <h3>${accommodation.id}</h3>
                                <p>${accommodation.accessibilityNeed}</p>
                                <p>${accommodation.accommodations}</p>
                            </div>
                        `).join('')}
</div>
                `
            } else {
                resultArea.innerHTML = "No Item";
            }
        }

    async renderAccommodations() {
        let resultArea = document.getElementById("result-info");

        const accommodations = this.dataStore.get("accommodations");

        if (accommodations) {
            resultArea.innerHTML = `
                <div>Id: ${accommodations.id}</div>
                <div>Accessibility Need: ${accommodations.accessibilityNeed}</div>
                <div>Accommodation: ${accommodations.accommodations}</div>
            `
        } else {
            resultArea.innerHTML = "No Item";
        }
    }

    // Event Handlers --------------------------------------------------------------------------------------------------

    async onGet(event) {
        // Prevent the page from refreshing on form submit
        event.preventDefault();

        let id = document.getElementById("id-field").value;
        this.dataStore.set("accommodations", null);

        let result = await this.client.getAccommodations(id, this.errorHandler);
        this.dataStore.set("accommodations", result);
        if (result) {
            this.showMessage(`Got ${result.name}!`)
        } else {
            this.errorHandler("Error doing GET!  Try again...");
        }
    }

    async onGetAll(event) {
            // Prevent the page from refreshing on form submit
            event.preventDefault();

            this.dataStore.set("accommodationsAll", null);

            let result = await this.client.getAllAccommodations(this.errorHandler);
            console.log("result here");
            console.log(result);
            this.dataStore.set("accommodationsAll", result);
            if (result) {
                this.showMessage(`Got ${result.name}!`)
            } else {
                this.errorHandler("Error doing GET!  Try again...");
            }
            await this.renderAllAccommodations();
        }

    async onCreate(event) {
        // Prevent the page from refreshing on form submit
        event.preventDefault();
        this.dataStore.set("accommodations", null);

        let accessibilityNeed = document.getElementById("create-accessibility-need-field").value;
        let accommodation = document.getElementById("create-accommodation-field").value;
        const createdAccommodation = await this.client.createAccommodation(accessibilityNeed, accommodation, this.errorHandler);
        this.dataStore.set("accommodations", createdAccommodation);

        if (createdAccommodation) {
            this.showMessage(`Created ${createdAccommodation.accessibilityNeed}!`)
        } else {
            this.errorHandler("Error creating!  Try again...");
        }
    }
}

/**
 * Main method to run when the page contents have loaded.
 */
const main = async () => {
    const accommodationsPage = new AccommodationPage();
    await accommodationsPage.mount();
};

window.addEventListener('DOMContentLoaded', main);
