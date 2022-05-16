package com.abc.models;

public class User {

    private String userId;
    private String email;
    private String name;
    private String contact;
    private String role;
    private String password;

    private User() {
    }

    public User(String userId, String email, String name, String contact, String role, String password) {
        this.userId = userId;
        this.email = email;
        this.name = name;
        this.contact = contact;
        this.role = role;
        this.password = password;
    }

    public User(String email, String name, String contact, String role, String password) {
        this.email = email;
        this.name = name;
        this.contact = contact;
        this.role = role;
        this.password = password;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserId() {
        return userId;
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    public String getContact() {
        return contact;
    }

    public String getRole() {
        return role;
    }

    public String getPassword() {
        return password;
    }
}