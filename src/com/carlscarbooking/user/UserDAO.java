package com.carlscarbooking.user;

public class UserDAO {
    private static final User[] users;

    static {
        users = new User[]{
                new User("John Doe", "john@doe.com"),
        };
    }

    public static User getUser() {
        return users[0];
    }
}
