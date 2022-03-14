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
public class Usalary {
    private int stt;
    private String id;
    private String fullName;
    private String status;
    private String imgUrl;
    private Date date;
    private double money;

    public Usalary() {
    }

    public Usalary(int stt, String id, String fullName, String status, String imgUrl, Date date, double money) {
        this.stt = stt;
        this.id = id;
        this.fullName = fullName;
        this.status = status;
        this.imgUrl = imgUrl;
        this.date = date;
        this.money = money;
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

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "Usalary{" + "stt=" + stt + ", id=" + id + ", fullName=" + fullName + ", status=" + status + ", imgUrl=" + imgUrl + ", date=" + date + ", money=" + money + '}';
    }

    
}
