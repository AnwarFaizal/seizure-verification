/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pejal.verification.mdm;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author pejalhebat
 */
@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@Data
@AllArgsConstructor
@NoArgsConstructor
public class StatusFlowMDM extends BaseMDM{
    
    private String flowGroup;
    
    @ManyToOne
    @JoinColumn(name="id", insertable=false, updatable=false)
    private StatusMDM fromStatus;
    
    @ManyToOne
    @JoinColumn(name="id", insertable=false, updatable=false)
    private StatusMDM toStatus;
    
}
