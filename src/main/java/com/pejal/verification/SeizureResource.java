/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pejal.verification;

import javax.ws.rs.Path;

/**
 *
 * @author Ryzen 5
 */
@Path("/seizures")
public class SeizureResource {
    private final SeizureRepository seizureRepository;

    public SeizureResource(SeizureRepository seizureRepository) {
        this.seizureRepository = seizureRepository;
    }
    
    
}
