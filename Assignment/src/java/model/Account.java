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
    private int uId;
    private String username;
    private String password;
    private int isEmploy;
    private int isAdmin;

    public Account() {
    }

    public Account(int uId, String username, String password, int isEmploy, int isAdmin) {
        this.uId = uId;
        this.username = username;
        this.password = password;
        this.isEmploy = isEmploy;
        this.isAdmin = isAdmin;
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

    public int getIsEmploy() {
        return isEmploy;
    }

    public void setIsEmploy(int isEmploy) {
        this.isEmploy = isEmploy;
    }

    public int getIsAdmin() {
        return isAdmin;
    }

    public void setIsAdmin(int isAdmin) {
        this.isAdmin = isAdmin;
    }

    @Override
    public String toString() {
        return "Account{" + "uId=" + uId + ", username=" + username + ", password=" + password + ", isEmploy=" + isEmploy + ", isAdmin=" + isAdmin + '}';
    }

    
    
}
