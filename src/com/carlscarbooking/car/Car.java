package com.carlscarbooking.car;

import com.carlscarbooking.booking.Booking;

import java.util.UUID;

public class Car {
    private final UUID carId;
    private final String make;
    private final String model;
    private final String year;
    private final EngineType engineType;
    private Booking booking;

    public Car(String make, String model, String year, EngineType engineType, Booking booking) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.engineType = engineType;
        this.booking = booking;

        this.carId = UUID.randomUUID();
    }

    public UUID getCarId() {
        return carId;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getYear() {
        return year;
    }

    public EngineType getEngineType() {
        return engineType;
    }

    public Booking getBooking() {
        return booking;
    }

    public void setBooking(Booking booking) {
        this.booking = booking;
    }

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year='" + year + '\'' +
                ", engineType=" + engineType +
                '}';
    }
}
