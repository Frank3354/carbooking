package com.carlscarbooking.menu;

enum MenuOption {
    BOOK_CAR("Book a car"),
    VIEW_ALL_USER_BOOKED_CARS("View all user booked cars"),
    VIEW_ALL_BOOKINGS("View all bookings"),
    VIEW_AVAILABLE_CARS("View available cars"),
    VIEW_AVAILABLE_ELECTRIC_CARS("View available electric cars"),
    VIEW_ALL_USERS("View all users"),
    LOGOUT("Logout and exit");

    private final String description;

    MenuOption(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
