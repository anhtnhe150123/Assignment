/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 *
 * @author Apple
 */
@Builder
@Getter
@Setter
@ToString
public class Employee {
    private String id;
    private String name;
    private String dateBirth;
    private String gender;
    private String position;
    private String startDate;
}
