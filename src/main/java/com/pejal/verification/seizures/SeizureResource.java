/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pejal.verification.seizures;

import com.pejal.verification.seizures.business.SeizureBusinessHandler;
import com.pejal.verification.mdm.status.StatusMDM;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author pejalhebat
 */
@Path("/seizures")
public class SeizureResource {
    private final SeizureRepository seizureRepository;
    
    @Autowired
    SeizureBusinessHandler seizureHandler;

    public SeizureResource(SeizureRepository seizureRepository) {
        this.seizureRepository = seizureRepository;
    }
    
    @GET
    @Path("/all")
    @Produces("application/json")
    public Iterable<Seizure> findAll() {
        return seizureRepository.findAll();
    }
    
    @GET
    @Path("/{id}")
    @Produces("application/json")
    public Seizure findById(@PathParam("id") Long id) {
        
        return seizureRepository.findById(id)
                .orElse(seizureHandler.generateDefaultSeizure());
    }
    
    @GET
    @Path("/{id}/products")
    @Produces("application/json")
    public List<ProductSeized> productsById(@PathParam("id") Long id) {
        
        Seizure seizure = seizureRepository.findById(id)
                .orElse(null);
        if (seizure == null || seizure.getProductsSeized().isEmpty()) {
            return List.of();
        }
        return seizure.getProductsSeized().stream().collect(Collectors.toList());

    }
    
    @POST
    @Consumes("application/json")
    @Produces("application/json")
    public Seizure persistSeizure(Seizure seizure) {
        
        Seizure inserted = seizureRepository.save(seizure);
        return inserted;
    }
    
    @DELETE
    @Path("/{id}")
    @Produces("application/json")
    public Seizure delete(@PathParam("id") Long id) {
        Seizure deleted = seizureRepository.findById(id).orElseThrow();
        seizureRepository.deleteById(id);
        return deleted;
    }
    
    @GET
    @Path("/status/all")
    @Produces("application/json")
    public List<StatusMDM> getAllStatus(){
        return seizureHandler.listAllStatus();
    }
}
