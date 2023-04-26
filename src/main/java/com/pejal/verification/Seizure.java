/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pejal.verification;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import lombok.Data;

/**
 *
 * @author pejalhebat
 */
@Entity
@Data
public class Seizure {
    
    @Id
    @GeneratedValue
    private Long id;

    private Date seizureDate;

    private String location;

    public Seizure() {
    }
}
