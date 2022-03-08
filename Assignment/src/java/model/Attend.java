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
    int id;
    String userName;
    String startTime;
    String endTime;

    public Attend() {
    }

    public Attend(int id, String userName, String startTime, String endTime) {
        this.id = id;
        this.userName = userName;
        this.startTime = startTime;
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

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    @Override
    public String toString() {
        return "Attend{" + "id=" + id + ", userName=" + userName + ", startTime=" + startTime + ", endTime=" + endTime + '}';
    }
    
    
    
}
