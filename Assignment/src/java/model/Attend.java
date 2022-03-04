/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Date;
import java.sql.Timestamp;

/**
 *
 * @author Apple
 */
public class Attend {
    int stt;
    String id;
    Timestamp startTime;
    Timestamp endTime;

    public Attend() {
    }

    public Attend(int stt, String id, Timestamp startTime, Timestamp endTime) {
        this.stt = stt;
        this.id = id;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public Attend(String id) {
        this.id = id;
    }

    public int getStt() {
        return stt;
    }

    public void setStt(int stt) {
        this.stt = stt;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Timestamp getStartTime() {
        return startTime;
    }

    public void setStartTime(Timestamp startTime) {
        this.startTime = startTime;
    }

    public Timestamp getEndTime() {
        return endTime;
    }

    public void setEndTime(Timestamp endTime) {
        this.endTime = endTime;
    }

    @Override
    public String toString() {
        return "Attend{" + "stt=" + stt + ", id=" + id + ", startTime=" + startTime + ", endTime=" + endTime + '}';
    }

   

    
}
