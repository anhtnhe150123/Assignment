/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Apple
 */
public class Account {
    public static final String ADMIN="ADMIN";
    public static final String EMPLOY="EMPLOY";
    private int uId;
    private String username;
    private String password;
    private String role;

    public Account() {
    }

    public Account(int uId, String username, String password, String role) {
        this.uId = uId;
        this.username = username;
        this.password = password;
        this.role = role;
    }

    public int getuId() {
        return uId;
    }

    public void setuId(int uId) {
        this.uId = uId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "Account{" + "uId=" + uId + ", username=" + username + ", password=" + password + ", role=" + role + '}';
    }
}
