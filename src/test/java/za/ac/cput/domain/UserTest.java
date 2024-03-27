package za.ac.cput.domain;
/*
UserTest class
Author: Raymond van Niekerk (221154469)
Date:  March 2024
 */
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTimeoutPreemptively;
import static org.junit.jupiter.api.Assertions.fail;

import java.util.Date;

public class UserTest {

    @Test
    public void testUserEquality() {
        User user1 = new User.Builder()
                .setUserId("1")
                .setUsername("Raymond29")
                .setPassword("pass123")
                .setRole("admin")
                .setContactInfo("Raymond29@gmail.com")
                .build();

        User user2 = user1;

        System.out.println("User 1: " + user1);
        System.out.println("User 2: " + user2);

        assertEquals(user1, user2, "Objects should be equal");
        System.out.println("*User Equality Test Passed*");
    }

    @Test
    public void testUserIdentity() {
        User.Builder userBuilder = new User.Builder()
                .setUserId("1")
                .setUsername("john_doe")
                .setPassword("password123")
                .setRole("admin")
                .setContactInfo("john.doe@example.com");

        User user1 = userBuilder.build();
        User user2 = user1;

        System.out.println("User 1: " + user1);
        System.out.println("User 2: " + user2);

        assertSame(user1, user2, "Objects should be the same");
        System.out.println("*User Identity Test Passed*");
    }

    @Test
    public void testFailingTest() {
        System.out.println("*Failing Test Executed*");
        fail("*This test intentionally fails*");
    }

    @Test
    public void testTimeout() {
        assertTimeoutPreemptively(
                java.time.Duration.ofMillis(100),
                () -> {
                    // Simulate a time-consuming operation
                    Thread.sleep(50);
                },
                "Operation took longer than expected"
        );
        System.out.println("*Timeout Test Passed*");
    }

    @Test
    @Disabled
    public void testDisabledTest() {
        System.out.println("Disabled Test Executed");
    }
}