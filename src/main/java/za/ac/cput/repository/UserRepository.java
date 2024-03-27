package za.ac.cput.repository;

import za.ac.cput.domain.User;

import java.util.ArrayList;
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
    public void addUser(User user) {
        users.add(user);
    }

    @Override
    public User getUserById(String userId) {
        for (User user : users) {
            if (user.getUserId().equals(userId)) {
                return user;
            }
        }
        return null;
    }

    @Override
    public void updateUser(User user) {
        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).getUserId().equals(user.getUserId())) {
                users.set(i, user);
                break;
            }
        }
    }

    @Override
    public boolean deleteUser(String userId) {
        User userToDelete = getUserById(userId);
        if (userToDelete == null)
            return false;
        return users.remove(userToDelete);
    }

    @Override
    public List<User> getAllUsers() {
        return new ArrayList<>(users);
    }
}
