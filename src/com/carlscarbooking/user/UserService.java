package com.carlscarbooking.user;

import com.carlscarbooking.user.dto.User;

public class UserService {
    public static User getUser() {
        return UserDAO.getUser();
    }
}
