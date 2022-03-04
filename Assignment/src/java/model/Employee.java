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
    private String position;
    private Date startDate;

    public Employee() {
    }

    public Employee(String id, String name, Date dob, String gender, String position, Date startDate) {
        this.id = id;
        this.name = name;
        this.dob = dob;
        this.gender = gender;
        this.position = position;
        this.startDate = startDate;
    }

    public Employee(String name, Date dob, String gender, String position, Date startDate) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    @Override
    public String toString() {
        return "Employee{" + "id=" + id + ", name=" + name + ", dob=" + dob + ", gender=" + gender + ", position=" + position + ", startDate=" + startDate + '}';
    }
    
}
