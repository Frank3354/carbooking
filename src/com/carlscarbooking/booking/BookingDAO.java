package com.carlscarbooking.booking;

import com.carlscarbooking.booking.dto.Booking;

import java.util.Arrays;
import java.util.UUID;

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

    public static Booking[] getUserBookings(UUID userId) {
        return Arrays
                .stream(bookings)
                .filter(booking -> booking.getUser().getUserId().equals(userId))
                .toArray(Booking[]::new);
    }
}
