package com.carlscarbooking.menu;

import com.carlscarbooking.booking.BookingService;
import com.carlscarbooking.car.Car;
import com.carlscarbooking.car.CarService;

public class MenuService {

    public static void displayOptions() {
        var output = new StringBuilder();
        int count = 1;

        for(MenuOption option : MenuOption.values()) {
            output.append(count++).append(". ").append(option.getDescription()).append("\n");
        }

        System.out.println(output);
    }

    public static void handleOption(int optionNumber) {
        if (optionNumber == MenuOption.VIEW_AVAILABLE_CARS.getValue()) {
            System.out.println("Inside executeOption if block");
            displayAvailableCars();
        } else if (optionNumber == MenuOption.BOOK_CAR.getValue()) {
            createBooking();
        } else if (optionNumber == MenuOption.VIEW_ALL_USER_BOOKED_CARS.getValue()) {
            displayBookedCars();
        }
    }

    private static void createBooking() {
        BookingService.createBooking();
    }

    private static void displayAvailableCars() {
        int count = 1;
        var output = new StringBuilder();

        for(Car car: CarService.getAllCars()) {
            output.append(count++).append(". ").append(car.toString()).append("\n");
        }

        System.out.println(output);
    }

    private static void displayBookedCars() {
        int count = 1;
        var output = new StringBuilder();
        var cars = CarService.getAllBookedCars();

        if(cars.length == 0) {
            output.append("No booked cars\n");
            System.out.println(output);
            return;
        }

        for(Car car: cars) {
            output.append(count++).append(". ").append(car.toString()).append("\n");
        }

        System.out.println(output);
    }

    public static boolean exit() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
