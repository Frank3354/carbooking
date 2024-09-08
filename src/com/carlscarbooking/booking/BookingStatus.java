package com.carlscarbooking.booking;

public enum BookingStatus{
    DRAFT("Draft"),
    CONFIRMED("Confirmed"),
    IN_PROGRESS("In Progress"),
    COMPLETED("Completed"),
    CANCELLED("Cancelled"),
    OVERDUE("Overdue");

    private final String description;

    BookingStatus(String description){
        this.description = description;
    }

    public String getDescription(){
        return description;
    }
}
