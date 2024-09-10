package com.carlscarbooking.car;

import java.util.Arrays;

class CarDAO {
    private static final Car[] cars;

    static {
        cars = new Car[]{
            new Car("Mazda", "3", "2024", EngineType.GASOLINE, null),
            new Car("Lincoln", "Navigator", "2024", EngineType.GASOLINE, null),
            new Car("Volkswagen", "Jetta", "2024", EngineType.DIESEL, null),
            new Car("Tesla", "Model S", "2022", EngineType.ELECTRIC, null),
            new Car("Ford", "Mustang", "2023", EngineType.ELECTRIC, null),
        };
    }

    protected static Car[] getAllCars() {
        return Arrays.copyOf(cars, cars.length);
    }

    protected static Car[] getAllBookedCars() {
        return Arrays
                .stream(cars)
                .filter(car -> car.getBooking() != null)
                .toArray(Car[]::new);

    }
}
