/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pejal.verification.seizures;

import com.pejal.verification.mdm.products.PackagingTypeMDM;
import com.pejal.verification.mdm.products.PackagingVolumeMDM;
import com.pejal.verification.mdm.products.ProductTypeMDM;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 *
 * @author pejalhebat
 */
@Entity
@Table(name="product_seized")
//@Data
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ProductSeized {
    
    @Id
    @GeneratedValue
    private Long id;
    
    @OneToOne(optional = true, cascade = CascadeType.ALL)
    @JoinColumn(name = "producttype_id", referencedColumnName = "id")
    private ProductTypeMDM productType;
    
    @OneToOne(optional = true, cascade = CascadeType.ALL)
    @JoinColumn(name = "packagingtype_id", referencedColumnName = "id")
    private PackagingTypeMDM packagingType;
    
    @OneToOne(optional = true, cascade = CascadeType.ALL)
    @JoinColumn(name = "packagingvolume_id", referencedColumnName = "id")
    private PackagingVolumeMDM packagingVolume;
    
    private Long quantity;
    
    
}
