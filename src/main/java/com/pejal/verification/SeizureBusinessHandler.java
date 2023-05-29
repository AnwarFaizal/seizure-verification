/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pejal.verification;

import com.pejal.verification.mdm.StatusMDM;
import com.pejal.verification.mdm.StatusMDMRepository;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import org.apache.commons.collections.IteratorUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 *
 * @author pejalhebat
 */

@Component
public class SeizureBusinessHandler {
    
    @Autowired
    SeizureRepository seizureRepository;
    
    @Autowired
    StatusMDMRepository statusRepository;
    
    public SeizureBusinessHandler() {
        
    }
    
    public Seizure generateDefaultSeizure(){
        Optional<StatusMDM> defaultStatus = statusRepository.findById(1L);
        Seizure newSeizure = new Seizure(Long.valueOf(99L),new Date(),"Kajang");
        newSeizure.setStatus(defaultStatus.orElse(null));
        return newSeizure;
    }
    
    public List<StatusMDM> listAllStatus() {
        return IteratorUtils.toList(statusRepository.findAll().iterator());
    }
    
}
