/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pejal.verification;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

/**
 *
 * @author pejalhebat
 */
@Path("/seizures")
public class SeizureResource {
    private final SeizureRepository seizureRepository;

    public SeizureResource(SeizureRepository seizureRepository) {
        this.seizureRepository = seizureRepository;
    }
    
    @GET
    @Path("/all")
    @Produces("application/json")
    public Iterable<Seizure> findAll() {
        return seizureRepository.findAll();
    }
}
