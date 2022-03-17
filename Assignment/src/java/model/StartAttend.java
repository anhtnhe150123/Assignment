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
public class StartAttend {
    private int id;
    private String userName;
    private String startTime;
    private String date;
    private int total;

    public StartAttend() {
    }

    public StartAttend(int id, String userName, String startTime, String date, int total) {
        this.id = id;
        this.userName = userName;
        this.startTime = startTime;
        this.date = date;
        this.total = total;
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

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "StartAttend{" + "id=" + id + ", userName=" + userName + ", startTime=" + startTime + ", date=" + date + ", total=" + total + '}';
    }

    
}
