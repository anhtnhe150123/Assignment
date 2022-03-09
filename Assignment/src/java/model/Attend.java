/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Date;

/**
 *
 * @author Apple
 */
public class Attend {
    private int id;
    private String userName;
    private String startTime;

    public Attend() {
    }

    public Attend(int id, String userName, String startTime) {
        this.id = id;
        this.userName = userName;
        this.startTime = startTime;
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

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    @Override
    public String toString() {
        return "Attend{" + "id=" + id + ", userName=" + userName + ", startTime=" + startTime + '}';
    }
    
}
