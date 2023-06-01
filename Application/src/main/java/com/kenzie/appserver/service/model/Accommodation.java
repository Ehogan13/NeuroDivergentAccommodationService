package com.kenzie.appserver.service.model;

import java.util.List;
import java.util.Set;

public class Accommodation {
    private final String id;
    private final String accessibilityNeed;
    private final Set<String> accommodations;

    public Accommodation(String id, String accessibilityNeed, Set<String> accommodations) {
        this.id = id;
        this.accessibilityNeed = accessibilityNeed;
        this.accommodations = accommodations;
    }

    public String getId() {
        return id;
    }

    public String getAccessibilityNeed() {
        return accessibilityNeed;
    }

    public Set<String> getAccommodations() {
        return accommodations;
    }

}
