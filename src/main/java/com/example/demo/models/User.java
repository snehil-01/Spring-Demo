package com.example.demo.models;

public class User {
    private String firstName;
    private String lastName;
    private String emailId;
    private String phoneNumber;

    public User(String firstName, String lastName, String emailId, String phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.emailId = emailId;
        this.phoneNumber = phoneNumber;
    }
    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", emailId='" + emailId + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
