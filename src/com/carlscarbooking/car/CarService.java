package com.carlscarbooking.car;

public class CarService {

    public static Car[] getAllBookedCars() {
        return CarDAO.getAllBookedCars();
    }

    public static Car[] getAllCars() {
        return CarDAO.getAllCars();
    }
}
