package com.kenzie.appserver.controller.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.constraints.NotEmpty;
import java.util.List;
import java.util.Set;

public class AccommodationCreateRequest {

    @NotEmpty
    @JsonProperty("accessibilityNeed")
    private String accessibilityNeed;

    @JsonProperty("accommodations")
    private String accommodations;


    public String getAccessibilityNeed() {
        return accessibilityNeed;
    }

    public void setAccessibilityNeed(String accessibilityNeed) {
        this.accessibilityNeed = accessibilityNeed;
    }

    public String getAccommodations() { return accommodations; }

    public void setAccommodations(String accommodations) { this.accommodations = accommodations; }
}
