/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pejal.verification;

import com.pejal.verification.mdm.StatusMDM;
import java.util.Date;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author pejalhebat
 */
@Entity
@Data
@NoArgsConstructor
public class Seizure {
    
    @Id
    @GeneratedValue
    private Long id;

    private Date seizureDate;

    private String location;
    
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn()
    private StatusMDM status;
    
    public Seizure(Long id, Date seizureDate, String location ) {
        this.id = id;
        this.seizureDate = seizureDate;
        this.location = location;
    }

}
