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
public class Absent {
    private int stt;
    private String id;
    private int dayOff;
    private Date start;
    private Date end;
    private String fullName;
    private String imgUrl;

    public Absent() {
    }

    public Absent(int stt, String id, int dayOff, Date start, Date end, String fullName, String imgUrl) {
        this.stt = stt;
        this.id = id;
        this.dayOff = dayOff;
        this.start = start;
        this.end = end;
        this.fullName = fullName;
        this.imgUrl = imgUrl;
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

    public int getDayOff() {
        return dayOff;
    }

    public void setDayOff(int dayOff) {
        this.dayOff = dayOff;
    }

    public Date getStart() {
        return start;
    }

    public void setStart(Date start) {
        this.start = start;
    }

    public Date getEnd() {
        return end;
    }

    public void setEnd(Date end) {
        this.end = end;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    @Override
    public String toString() {
        return "Absent{" + "stt=" + stt + ", id=" + id + ", dayOff=" + dayOff + ", start=" + start + ", end=" + end + ", fullName=" + fullName + ", imgUrl=" + imgUrl + '}';
    }
    
    
}
