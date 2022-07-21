package com.organisedcrime.ui;

import com.organisedcrime.models.GangExpectedTime;

import java.util.Map;
import java.util.SortedMap;

public class LocationViewState {
    private final String description;
    private final String image;
    private final Map<GangExpectedTime, Integer> expectedTimeToWorld;

    public LocationViewState(String description, String image, SortedMap<GangExpectedTime, Integer> expectedTimeToWorld) {
        this.description = description;
        this.image = image;
        this.expectedTimeToWorld = expectedTimeToWorld;
    }

    public String getDescription() {
        return description;
    }

    public String getImage() {
        return image;
    }

    public Map<GangExpectedTime, Integer> getExpectedTimeToWorld() {
        return expectedTimeToWorld;
    }

    @Override
    public String toString() {
        return "LocationViewState{" +
                "description='" + description + '\'' +
                ", image='" + image + '\'' +
                ", expectedTimeToWorld=" + expectedTimeToWorld +
                '}';
    }
}
