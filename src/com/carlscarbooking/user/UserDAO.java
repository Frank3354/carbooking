package com.carlscarbooking.user;

import com.carlscarbooking.user.dto.User;

class UserDAO {
    private static final User[] users;

    static {
        users = new User[]{
                new User("John Doe", "john@doe.com"),
        };
    }

    protected static User getUser() {
        return users[0];
    }
}
