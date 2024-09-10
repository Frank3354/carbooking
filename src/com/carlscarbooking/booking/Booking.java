package com.carlscarbooking.booking;

import com.carlscarbooking.car.Car;
import com.carlscarbooking.user.User;

import java.util.Date;
import java.util.UUID;

public class Booking {
    private final UUID bookingID;
    private User user;
    private Car bookedCar;
    private BookingStatus bookingStatus;
    private Date reservationStartDateTime;
    private Date reservationEndDateTime;
    private Date reservationCanceledDateTime;
    private Date bookingCompleteDateTime;

    public Booking(User user) {
        this.user = user;
        this.bookingID = UUID.randomUUID();
    }

    public UUID getBookingID() {
        return bookingID;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Car getBookedCar() {
        return bookedCar;
    }

    public void setBookedCar(Car bookedCar) {
        this.bookedCar = bookedCar;
        bookedCar.setBooking(this);
    }

    public BookingStatus getBookingStatus() {
        return bookingStatus;
    }

    public void setBookingStatus(BookingStatus bookingStatus) {
        this.bookingStatus = bookingStatus;
    }

    public Date getReservationStartDateTime() {
        return reservationStartDateTime;
    }

    public void setReservationStartDateTime(Date reservationStartDateTime) {
        this.reservationStartDateTime = reservationStartDateTime;
    }

    public Date getReservationEndDateTime() {
        return reservationEndDateTime;
    }

    public void setReservationEndDateTime(Date reservationEndDateTime) {
        this.reservationEndDateTime = reservationEndDateTime;
    }

    public Date getReservationCanceledDateTime() {
        return reservationCanceledDateTime;
    }

    public void setReservationCanceledDateTime(Date reservationCanceledDateTime) {
        this.reservationCanceledDateTime = reservationCanceledDateTime;
    }

    public Date getBookingCompleteDateTime() {
        return bookingCompleteDateTime;
    }

    public void setBookingCompleteDateTime(Date bookingCompleteDateTime) {
        this.bookingCompleteDateTime = bookingCompleteDateTime;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "bookingID=" + bookingID + "\n" +
                ", user=" + user + "\n" +
                ", bookedCar=" + bookedCar + "\n" +
                ", bookingStatus=" + bookingStatus + "\n" +
                ", reservationStartDateTime=" + reservationStartDateTime + "\n" +
                ", reservationEndDateTime=" + reservationEndDateTime + "\n" +
                ", reservationCanceledDateTime=" + reservationCanceledDateTime + "\n" +
                ", bookingCompleteDateTime=" + bookingCompleteDateTime + "\n" +
                '}';
    }
}
