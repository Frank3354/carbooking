package com.carlscarbooking.car;

public enum EngineType {
    GASOLINE("Gasoline"),
    DIESEL("Diesel"),
    ELECTRIC("Electric");

    private final String description;

    EngineType(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
