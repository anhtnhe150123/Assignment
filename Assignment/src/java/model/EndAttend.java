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
public class EndAttend {
    private int id;
    private String userName;
    private String endTime;
    private String date;

    public EndAttend() {
    }

    public EndAttend(int id, String userName, String endTime, String date) {
        this.id = id;
        this.userName = userName;
        this.endTime = endTime;
        this.date = date;
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

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "EndAttend{" + "id=" + id + ", userName=" + userName + ", endTime=" + endTime + ", date=" + date + '}';
    }

   
}
