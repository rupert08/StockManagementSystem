package za.ac.cput.repository;
/*
IUserRepository class
Author: Raymond van Niekerk (221154469)
Date:  March 2024
 */
import za.ac.cput.domain.User;

import java.util.List;

public interface IUserRepository {
    // Create
    void addUser(User user);

    // Read
    User getUserById(String userId);

    // Update
    void updateUser(User user);

    // Delete
    boolean deleteUser(String userId);

    // Get all users
    List<User> getAllUsers();
}
