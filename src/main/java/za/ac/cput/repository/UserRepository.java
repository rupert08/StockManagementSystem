package za.ac.cput.repository;

import za.ac.cput.domain.User;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
/*
UserRepository class
Author: Raymond van Niekerk (221154469)
Date:  March 2024
 */
public class UserRepository implements IUserRepository {

    private List<User> users;

    public UserRepository() {
        this.users = new ArrayList<>();
    }

    @Override
    public void add(User user) {
        users.add(user);
    }

    @Override
    public User getById(String userId) {
        for (User user : users) {
            if (user.getUserId().equals(userId)) {
                return user;
            }
        }
        return null;
    }

    @Override
    public User create(User user) {
        return null;
    }

    @Override
    public User read(String s) {
        return null;
    }

    @Override
    public User update(User user) {
        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).getUserId().equals(user.getUserId())) {
                users.set(i, user);
                break;
            }
        }
        return user;
    }

    @Override
    public boolean delete(String userId) {
        User userToDelete = getById(userId);
        if (userToDelete == null)
            return false;
        return users.remove(userToDelete);
    }

    @Override
    public List<User> getAll() {
        return new ArrayList<>(users);
    }

    @Override
    public User getUsername(String username) {
        return null;
    }

    @Override
    public List<User> getRole(String role) {
        return null;
    }

    @Override
    public void addUser(User user) {

    }

    public Collection<Object> getAllUsers() {
        return null;
    }

    public User getUserById(String userId) {
        return null;
    }

    public void updateUser(User updatedUser) {
    }

    public void deleteUser(String userId) {
    }
}

