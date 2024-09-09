package com.carlscarbooking.menu;

enum MenuOption {
    BOOK_CAR(1, "Book a car"),
    VIEW_ALL_USER_BOOKED_CARS(2, "View all user booked cars"),
    VIEW_ALL_BOOKINGS(3, "View all bookings"),
    VIEW_AVAILABLE_CARS(4, "View available cars"),
    VIEW_AVAILABLE_ELECTRIC_CARS(5, "View available electric cars"),
    VIEW_ALL_USERS(6, "View all users"),
    LOGOUT(7, "Logout and exit");

    private final int value;
    private final String description;

    MenuOption(int startingValue, String description) {
        this.description = description;
        this.value = startingValue;
    }

    public String getDescription() {
        return description;
    }

    public int getValue() {
        return value;
    }
}
