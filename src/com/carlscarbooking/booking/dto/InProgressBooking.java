package com.carlscarbooking.booking.dto;

import com.carlscarbooking.user.dto.User;

import java.util.Date;

public class InProgressBooking extends Booking {
    private final Date inProgressDateTime;

    public InProgressBooking(User user) {
        super(user);
        this.inProgressDateTime = new Date();
    }

    public Date getInProgressDateTime() {
        return inProgressDateTime;
    }
}
