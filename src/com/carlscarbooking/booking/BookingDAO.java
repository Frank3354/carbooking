package com.carlscarbooking.booking;

import java.util.Arrays;

public class BookingDAO {
    private static final Booking[] bookings;
    private static int nextEmptyBooking;

    static {
        bookings = new Booking[100];
    }

    public static Booking createBooking(Booking booking) {
        bookings[nextEmptyBooking++] = booking;

        return booking;
    }

    public static Booking[] getAllBookings() {
        return Arrays.copyOf(bookings, nextEmptyBooking + 1);
    }
}
