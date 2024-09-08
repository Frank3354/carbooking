package com.carlscarbooking.menu;

import com.carlscarbooking.booking.BookingService;
import com.carlscarbooking.car.CarService;
import com.carlscarbooking.user.UserService;

public class MenuService {

    public static void displayOptions() {
        var output = new StringBuilder();
        int count = 1;

        for(MenuOption option : MenuOption.values()) {
            output.append(count++).append(". ").append(option.getDescription()).append("\n");
        }

        System.out.println(output);
    }

    /**
     * Handles user input
     *
     * @param optionNumber Represents a users selected option as an integer
     */
    public static void handleOption(int optionNumber) {
        if (optionNumber == MenuOption.VIEW_AVAILABLE_CARS.getValue()) {
            displayAvailableCars();
        } else if (optionNumber == MenuOption.BOOK_CAR.getValue()) {
            createBooking();
        } else if (optionNumber == MenuOption.VIEW_ALL_USER_BOOKED_CARS.getValue()) {
            displayBookedCars();
        } else if (optionNumber == MenuOption.VIEW_ALL_BOOKINGS.getValue()) {
            displayAllBookings();
        } else if (optionNumber == MenuOption.VIEW_AVAILABLE_ELECTRIC_CARS.getValue()) {
            displayAvailableElectricCars();
        } else if (optionNumber == MenuOption.VIEW_ALL_USERS.getValue()) {
            displayAllUsers();
        }
    }

    /**
     * Creates a booking with an associated user and a car
     */
    private static void createBooking() {
        BookingService.createBooking();
    }


    /**
     * Displays elements formatted as a numbered list.
     *
     * @param items an arbitrary array
     * @param <T> the type of elements in the array
     */
    private static <T> void displayItems(T[] items) {
        int count = 1;
        var output = new StringBuilder();

        for(T item : items) {
            output.append(count++).append(". ").append(item.toString()).append("\n");
        }

        System.out.println(output);
    }

    /**
     * Displays a list of available cars
     */
    private static void displayAvailableCars() {
        var cars = CarService.getAvailableCars();

        if (cars.length == 0) {
            System.out.println("\n\nNo available cars\n\n");
            return;
        }

        System.out.println("""
                \n
                ##################
                Available cars:
                """);

        displayItems(cars);
    }

    private static void displayAvailableElectricCars() {
        var cars = CarService.getAvailableElectricCars();

        if (cars.length == 0) {
            System.out.println("\n\nNo available electric cars\n\n");
            return;
        }

        System.out.println("""
                \n
                ##################
                Available electric cars:
                """);

        displayItems(cars);
    }

    /**
     * Displays booked cars
     */
    private static void displayBookedCars() {
        var cars = CarService.getAllBookedCars();

        if(cars.length == 0) {
            System.out.println("\n\nNo booked cars\n\n");
            return;
        }

        System.out.println("""
                \n
                ##################
                Booked cars:
                """);

        displayItems(cars);
    }

    /**
     * Displays all bookings
     */
    private static void displayAllBookings() {
        var bookings = BookingService.getAllBookings();

        if (bookings.length == 0) {
            System.out.println("\n\nNo bookings\n\n");
            return;
        }

        System.out.println("""
                \n
                ##################
                All bookings:
                """);

        displayItems(bookings);
    }

    private static void displayAllUsers() {
        var users = UserService.getAllUsers();

        if (users.length == 0) {
            System.out.println("\n\nNo users\n\n");
            return;
        }

        System.out.println("""
                \n
                ##################
                All users:
                """);

        displayItems(users);
    }
}
