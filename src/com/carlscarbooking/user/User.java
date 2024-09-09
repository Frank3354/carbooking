package com.carlscarbooking.user;

import com.carlscarbooking.booking.Booking;

import java.util.Arrays;
import java.util.UUID;

public class User {
    private UUID userId;
    private String firstName;
    private String lastName;
    private Booking[] bookings;

    public User(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;

        this.userId = UUID.randomUUID();
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", bookings=" + Arrays.toString(bookings) +
                '}';
    }
}
