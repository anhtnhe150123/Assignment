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
    Date startTime;
    Date endTime;
    int acoountId;

    public Attend() {
    }

    public Attend(int id, String userName, Date startTime, Date endTime, int acoountId) {
        this.id = id;
        this.userName = userName;
        this.startTime = startTime;
        this.endTime = endTime;
        this.acoountId = acoountId;
    }
    
}
