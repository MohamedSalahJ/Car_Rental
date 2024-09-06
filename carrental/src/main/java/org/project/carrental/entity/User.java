package org.project.carrental.entity;

import java.util.Objects;

public class User {

    private long id;

    private String userName;

    private String userEmail;

    private String userPassword;

    private String userAddress;

    private boolean userBlocked;

    private UserRole userRole;

    public User() {

    }

    public User(long id, String userName, String userEmail, String userPassword, String userAddress, boolean userBlocked, UserRole userRole) {
        this.id = id;
        this.userName = userName;
        this.userEmail = userEmail;
        this.userPassword = userPassword;
        this.userAddress = userAddress;
        this.userBlocked = userBlocked;
        this.userRole = userRole;
    }

    public User(String userName, String userEmail, String userPassword, String userAddress, boolean userBlocked, UserRole userRole) {
        this.userName = userName;
        this.userEmail = userEmail;
        this.userPassword = userPassword;
        this.userAddress = userAddress;
        this.userBlocked = userBlocked;
        this.userRole = userRole;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress;
    }

    public boolean isUserBlocked() {
        return userBlocked;
    }

    public void setUserBlocked(boolean userBlocked) {
        this.userBlocked = userBlocked;
    }

    public UserRole getUserRole() {
        return userRole;
    }

    public void setUserRole(UserRole userRole) {
        this.userRole = userRole;
    }
    //toString()
    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", userEmail='" + userEmail + '\'' +
                ", userPassword='" + userPassword + '\'' +
                ", userAddress='" + userAddress + '\'' +
                ", userBlocked=" + userBlocked +
                ", userRole=" + userRole +
                '}';
    }


    //Equals
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return id == user.id && userBlocked == user.userBlocked && Objects.equals(userName, user.userName) && Objects.equals(userEmail, user.userEmail) && Objects.equals(userPassword, user.userPassword) && Objects.equals(userAddress, user.userAddress) && userRole == user.userRole;
    }

    //HashCode
    @Override
    public int hashCode() {
        return Objects.hash(id, userName, userEmail, userPassword, userAddress, userBlocked, userRole);
    }
}
