package com.carlscarbooking.user;

import com.carlscarbooking.user.dto.User;

import java.util.Arrays;

class UserDAO {
    private static final User[] users;

    static {
        users = new User[]{
                new User("John Doe", "john@doe.com"),
                new User("Jane Doe", "Jane@doe.com"),
        };
    }

    protected static User getUser() {
        return users[0];
    }

    public static User[] getAllUsers() {
        return Arrays.copyOf(users, users.length);
    }
}
