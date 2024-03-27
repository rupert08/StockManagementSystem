package za.ac.cput.repository;
/*
UserRepositoryTest class
Author: Raymond van Niekerk (221154469)
Date:  March 2024
 */
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import za.ac.cput.domain.User;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Date;

public class UserRepositoryTest {

    private UserRepository repository;

    @BeforeEach
    void setUp() {
        repository = new UserRepository();
    }

    @Test
    void testAddUser() {
        User user = createUser("1", "Raymond29", "pass123", "admin", "Raymond29@gmail.com");
        repository.addUser(user);
        assertEquals(1, repository.getAllUsers().size(), "Repository should contain one user after addition");
        assertTrue(repository.getAllUsers().contains(user), "Repository should contain the added user");
        System.out.println("Add User Test Passed");
    }

    @Test
    void testGetUserById() {
        String userId = "1"; // Dynamic userId
        User user = createUser(userId, "Raymond29", "pass123", "admin", "Raymond29@gmail.com");
        repository.addUser(user);
        User retrievedUser = repository.getUserById(userId);
        assertNotNull(retrievedUser, "Retrieved user should not be null");
        assertEquals(user, retrievedUser, "Retrieved user should match the added user");
        System.out.println("Get User by ID Test Passed");
    }

    @Test
    void testUpdateUser() {
        String userId = "1"; // Dynamic userId
        User user = createUser(userId, "Raymond29", "pass123", "admin", "Raymond29@gmail.com");
        repository.addUser(user);

        User updatedUser = createUser(userId, "updated_Raymond29", "updated_pass123", "updated_admin", "updated.Raymond29@gmail.com");
        repository.updateUser(updatedUser);

        User retrievedUser = repository.getUserById(userId);
        assertEquals(updatedUser, retrievedUser, "Retrieved updated user should match the updated user");
        System.out.println("Update User Test Passed");
    }

    @Test
    void testDeleteUser() {
        String userId = "1"; // Dynamic userId
        User user = createUser(userId, "Raymond29", "pass123", "admin", "Raymond29@gmail.com");
        repository.addUser(user);

        assertTrue(repository.deleteUser(userId), "Deletion should be successful");
        assertEquals(0, repository.getAllUsers().size(), "Repository should be empty after deletion");
        System.out.println("Delete User Test Passed");
    }

    private User createUser(String userId, String username, String password, String role, String contactInfo) {
        return new User.Builder()
                .setUserId(userId)
                .setUsername(username)
                .setPassword(password)
                .setRole(role)
                .setContactInfo(contactInfo)
                .build();
    }
}