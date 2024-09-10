package com.carlscarbooking.booking.dto;

import com.carlscarbooking.user.dto.User;

import java.util.Date;

public class ConfirmedBooking extends Booking {
    private final Date confirmedDateTime;

    public ConfirmedBooking(User user) {
        super(user);
        this.confirmedDateTime = new Date();
    }


    public Date getConfirmedDateTime() {
        return confirmedDateTime;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" + "ConfirmedBooking{" +
                "confirmedDateTime=" + confirmedDateTime +
                '}';
    }
}
