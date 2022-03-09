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
public class Atten {
     private int id;
    private String userName;
    private String endTime;

    public Atten() {
    }

    public Atten(int id, String userName, String endTime) {
        this.id = id;
        this.userName = userName;
        this.endTime = endTime;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    @Override
    public String toString() {
        return "Atten{" + "id=" + id + ", userName=" + userName + ", endTime=" + endTime + '}';
    }
    
}
