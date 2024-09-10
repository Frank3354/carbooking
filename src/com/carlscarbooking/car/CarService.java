package com.carlscarbooking.car;

import com.carlscarbooking.car.dto.Car;

public class CarService {

    public static Car[] getAllBookedCars() {
        return CarDAO.getAllBookedCars();
    }

    public static Car[] getAllCars() {
        return CarDAO.getAllCars();
    }

    public static Car[] getAvailableCars() {
        return CarDAO.getAvailableCars();
    }

    public static Car[] getAvailableElectricCars() {
        return CarDAO.getAvailableElectricCars();
    }
}
