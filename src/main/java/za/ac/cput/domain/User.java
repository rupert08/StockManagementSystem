package za.ac.cput.domain;
/*
User class
Author: Raymond van Niekerk (221154469)
Date:  March 2024
 */
import javax.sql.RowSet;

public class User {

    private String userId;
    private String username;
    private String password;
    private String role;
    private String contactInfo;

    private User(Builder builder) {
        this.userId = builder.userId;
        this.username = builder.username;
        this.password = builder.password;
        this.role = builder.role;
        this.contactInfo = builder.contactInfo;
    }

    public String getUserId() {
        return userId;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getRole() {
        return role;
    }

    public String getContactInfo() {
        return contactInfo;
    }

    public static class Builder {
        private String userId;
        private String username;
        private String password;
        private String role;
        private String contactInfo;

        public Builder setUserId(String userId) {
            this.userId = userId;
            return this;
        }

        public Builder setUsername(String username) {
            this.username = username;
            return this;
        }

        public Builder setPassword(String password) {
            this.password = password;
            return this;
        }

        public Builder setRole(String role) {
            this.role = role;
            return this;
        }

        public Builder setContactInfo(String contactInfo) {
            this.contactInfo = contactInfo;
            return this;
        }

        public User build() {
            return new User(this);
        }
    }

        @Override
        public String toString() {
            return "Builder{" +
                    "userId='" + userId + '\'' +
                    ", username='" + username + '\'' +
                    ", password='" + password + '\'' +
                    ", role='" + role + '\'' +
                    ", contactInfo='" + contactInfo + '\'' +
                    '}';
        }


    }
