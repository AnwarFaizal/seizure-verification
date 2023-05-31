/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pejal.verification.mdm.products;

import com.pejal.verification.mdm.BaseMDM;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author pejalhebat
 */
@Entity
@Table(name="producttype_mdm")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@Data
//@AllArgsConstructor
@NoArgsConstructor
/**
 * TB - Tobacco
 * AL - Alcohol
 */
public class ProductTypeMDM extends BaseMDM {
    
    
    
}
