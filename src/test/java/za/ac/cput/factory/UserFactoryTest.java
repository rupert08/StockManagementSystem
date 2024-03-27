package za.ac.cput.factory;
/*
UserFactoryTest class
Author: Raymond van Niekerk (221154469)
Date:  March 2024
 */
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import za.ac.cput.domain.User;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.Date;

public class UserFactoryTest {

    @Test
    public void testCreateUser() {
        User user = UserFactory.createUser(
                "1", "Raymond29", "pass123", "admin", "Raymond29@gmail.com");

        assertNotNull(user, "User should not be null");
        assertEquals("1", user.getUserId(), "UserID should match");
        assertEquals("Raymond29", user.getUsername(), "Username should match");
        assertEquals("pass123", user.getPassword(), "Password should match");
        assertEquals("admin", user.getRole(), "Role should match");
        assertEquals("Raymond29@gmail.com", user.getContactInfo(), "ContactInfo should match");

        System.out.println("UserFactory Test Passed");
    }
}