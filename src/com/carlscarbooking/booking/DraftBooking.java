package com.carlscarbooking.booking;

import com.carlscarbooking.user.User;

import java.util.Date;

public class DraftBooking extends Booking {
    private final Date draftStartDateTime;
    private Date draftEndDateTime;

    public DraftBooking(User user) {
        super(user);

        this.draftStartDateTime = new Date();
    }

    public Date getDraftStartDateTime() {
        return draftStartDateTime;
    }

    public Date getDraftEndDateTime() {
        return draftEndDateTime;
    }

    public void setDraftEndDateTime(Date draftEndDateTime) {
        this.draftEndDateTime = draftEndDateTime;
    }
}
