package com.kidsguru.shop.models;

import com.kidsguru.shop.entities.UserEntity;

import java.sql.Timestamp;

public class User {
    private int userId;
    private String userName;
    private String password;
    private Timestamp registerDate;
    private String role;

    public User() {
    }

    public User(int userId, String userName, String password, Timestamp registerDate, String role) {
        this.userId = userId;
        this.userName = userName;
        this.password = password;
        this.registerDate = registerDate;
        this.role = role;
    }

    public User(UserEntity userEntity) {
        this.userId = userEntity.getUserId();
        this.userName = userEntity.getUserName();
        this.password = userEntity.getPassword();
        this.registerDate = userEntity.getRegisterDate();
        this.role = userEntity.getRole();
    }

    public UserEntity convertToEntity() {
        return new UserEntity(userId, userName, password, registerDate, role);
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Timestamp getRegisterDate() {
        return registerDate;
    }

    public void setRegisterDate(Timestamp registerDate) {
        this.registerDate = registerDate;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
