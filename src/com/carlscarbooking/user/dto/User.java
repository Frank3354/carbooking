package com.carlscarbooking.user.dto;

import com.carlscarbooking.booking.dto.Booking;
import com.carlscarbooking.booking.BookingService;

import java.util.UUID;

public class User {
    private final UUID userId;
    private final String firstName;
    private final String lastName;

    public User(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;

        this.userId = UUID.randomUUID();
    }

    public UUID getUserId() {
        return userId;
    }

    public Booking[] getUserBookings() {
        return BookingService.getUserBookings(this.userId);
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
