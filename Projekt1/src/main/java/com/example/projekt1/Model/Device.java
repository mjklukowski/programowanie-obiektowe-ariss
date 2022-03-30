package com.example.projekt1.Model;

public abstract class Device {
    private final String manufacturer;
    private final String model;

    public Device(String manufacturer, String model) {
        this.manufacturer = manufacturer;
        this.model = model;
    }
}