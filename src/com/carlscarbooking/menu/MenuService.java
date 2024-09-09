package com.carlscarbooking.menu;

import com.carlscarbooking.booking.BookingDAO;
import com.carlscarbooking.booking.BookingStatus;
import com.carlscarbooking.booking.ConfirmedBooking;
import com.carlscarbooking.car.Car;
import com.carlscarbooking.car.CarDAO;
import com.carlscarbooking.user.UserDAO;

import java.util.Date;
import java.util.Objects;

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
        }
    }

    private static void createBooking() {
        int oneDayInMs = 1000 * 60 * 60 * 24;
        var booking = BookingDAO.createBooking(new ConfirmedBooking(UserDAO.getUser()));

        booking.setBookedCar(CarDAO.getCars()[0]);
        booking.setBookingStatus(BookingStatus.CONFIRMED);
        booking.setReservationStartDateTime(new Date());
        booking.setReservationEndDateTime(new Date(new Date().getTime() + oneDayInMs * 3));
        System.out.println(booking);
    }

    private static void displayAvailableCars() {
        int count = 1;

        var output = new StringBuilder();

        for(Car car: CarDAO.getCars()) {
            output.append(count++).append(". ").append(car.toString()).append("\n");
        }

        System.out.println(output);
    }

    public static boolean exit() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
