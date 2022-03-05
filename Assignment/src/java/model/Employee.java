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

public class Employee {
    private String id;
    private String name;
    private Date dob;
    private String gender;
    private int positionId;
    private Date startDate;
    private String positionName;

    public Employee() {
    }

    public Employee(String id, String name, Date dob, String gender, int positionId, Date startDate, String positionName) {
        this.id = id;
        this.name = name;
        this.dob = dob;
        this.gender = gender;
        this.positionId = positionId;
        this.startDate = startDate;
        this.positionName = positionName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getPositionId() {
        return positionId;
    }

    public void setPositionId(int positionId) {
        this.positionId = positionId;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public String getPositionName() {
        return positionName;
    }

    public void setPositionName(String positionName) {
        this.positionName = positionName;
    }

    @Override
    public String toString() {
        return "Employee{" + "id=" + id + ", name=" + name + ", dob=" + dob + ", gender=" + gender + ", positionId=" + positionId + ", startDate=" + startDate + ", positionName=" + positionName + '}';
    }

   
    
}
