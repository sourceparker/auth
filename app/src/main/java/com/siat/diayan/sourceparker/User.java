package com.siat.diayan.sourceparker;

/**
 * Created by diayan on 1/23/2018.
 */

public class User {

    private String firstName;
    private String lastName;
    private String email;
    private String password;

    private String phoneNumber;
    private boolean isUser;
    private boolean isManager;
    private boolean isOwner;

    public User() {

    }

    public User(String firstName, String lastName, String email, String password, String phoneNumber, boolean isUser) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;

        this.phoneNumber = phoneNumber;
        this.isUser = isUser;

    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean getIsUser() {
        return isUser;
    }

    public void setIsUser(boolean isUser) {
        this.isUser = isUser;
    }


    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName +
                ", lastName='" + lastName +
                ", email='" + email +
                ", password='" + password +
                ", phoneNumber='" + phoneNumber +
                ", isUser='" + isUser;
    }
}
