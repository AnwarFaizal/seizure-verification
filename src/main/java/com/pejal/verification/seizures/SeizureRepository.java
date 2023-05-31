/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pejal.verification.seizures;

import java.util.Date;
import java.util.List;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author pejalhebat
 */
public interface SeizureRepository  extends CrudRepository<Seizure, Long> {
    
    List<Seizure> findBySeizureDate(Date seizureDate);
        
}
