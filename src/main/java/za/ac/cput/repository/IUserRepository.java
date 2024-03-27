package za.ac.cput.repository;
/*
IUserRepository class
Author: Raymond van Niekerk (221154469)
Date:  March 2024
 */
import za.ac.cput.domain.User;

import java.util.List;

public interface IUserRepository extends IRepository<User, String> {

    User getUsername(String username);
    List<User> getRole(String role);
}