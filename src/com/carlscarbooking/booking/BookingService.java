package com.carlscarbooking.booking;

import com.carlscarbooking.car.CarService;
import com.carlscarbooking.user.UserDAO;

import java.util.Date;

public class BookingService {
    public static void createBooking() {
        int oneDayInMs = 1000 * 60 * 60 * 24;
        var booking = BookingDAO.createBooking(new ConfirmedBooking(UserDAO.getUser()));

        booking.setBookedCar(CarService.getAllCars()[0]);
        booking.setBookingStatus(BookingStatus.CONFIRMED);
        booking.setReservationStartDateTime(new Date());
        booking.setReservationEndDateTime(new Date(new Date().getTime() + oneDayInMs * 3));
        System.out.println(booking);
    }
}
