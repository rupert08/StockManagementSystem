package za.ac.cput.factory;
/*
UserFactory class
Author: Raymond van Niekerk (221154469)
Date:  March 2024
 */
import za.ac.cput.domain.User;

import java.util.Date;

public class UserFactory {
    public static User createUser(String userId, String username, String password, String role,
                                  String contactInfo) {
        return new User.Builder()
                .setUserId(userId)
                .setUsername(username)
                .setPassword(password)
                .setRole(role)
                .setContactInfo(contactInfo)
                .build();
    }
}
