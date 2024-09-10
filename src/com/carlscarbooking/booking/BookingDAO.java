package com.carlscarbooking.booking;

import java.util.Arrays;

class BookingDAO {
    private static final Booking[] bookings;
    private static int nextEmptyBooking;

    static {
        bookings = new Booking[100];
    }

    protected static Booking createBooking(Booking booking) {
        bookings[nextEmptyBooking++] = booking;

        return booking;
    }

    protected static Booking[] getAllBookings() {
        return Arrays.copyOf(bookings, nextEmptyBooking);
    }
}
