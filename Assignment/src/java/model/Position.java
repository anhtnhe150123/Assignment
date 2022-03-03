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
public class Position {
    String position;
    Double basicSalary;

    public Position() {
    }

    public Position(String position, Double basicSalary) {
        this.position = position;
        this.basicSalary = basicSalary;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Double getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(Double basicSalary) {
        this.basicSalary = basicSalary;
    }

    @Override
    public String toString() {
        return "Position{" + "position=" + position + ", basicSalary=" + basicSalary + '}';
    }
    
}
