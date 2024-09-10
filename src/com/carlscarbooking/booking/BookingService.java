package com.carlscarbooking.booking;

import com.carlscarbooking.booking.dto.Booking;
import com.carlscarbooking.booking.dto.ConfirmedBooking;
import com.carlscarbooking.car.CarService;
import com.carlscarbooking.user.UserService;
import com.carlscarbooking.user.dto.User;

import java.util.Date;
import java.util.UUID;

public class BookingService {
    public static void createBooking() {
        int oneDayInMs = 1000 * 60 * 60 * 24;
        var user = UserService.getUser();
        var booking = BookingDAO.createBooking(new ConfirmedBooking(user));

        booking.setBookedCar(CarService.getAvailableCars()[0]);
        booking.setBookingStatus(BookingStatus.CONFIRMED);
        booking.setReservationStartDateTime(new Date());
        booking.setReservationEndDateTime(new Date(new Date().getTime() + oneDayInMs * 3));

        associateUserWithBooking(user, booking);

        System.out.println(booking);
    }

    public static Booking[] getAllBookings() {
        return BookingDAO.getAllBookings();
    }

    public static Booking[] getUserBookings(UUID userId) {
        return BookingDAO.getUserBookings(userId);
    }

    private static void associateUserWithBooking(User user, Booking booking) {
        booking.setUser(user);
    }
}
