/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restt;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import entities.Animal;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.core.MediaType;

/**
 * REST Web Service
 *
 * @author jacob
 */
@Path("animal")
public class AnimalResource {
    
    private static Gson gson = new GsonBuilder().setPrettyPrinting().create(); 

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of AnimalResource
     */
    public AnimalResource() {
    }

    /**
     * Retrieves representation of an instance of restt.AnimalResource
     * @return an instance of java.lang.String
     */
    @GET
    //@Produces(MediaType.APPLICATION_JSON)
    public String getJson() {
        return "Hello from my first webservice";
    }

    /**
     * PUT method for updating or creating an instance of AnimalResource
     * @param content representation for the resource
     */
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public void putJson(String content) {
    }
    
    @GET
    @Path("random")
    @Produces(MediaType.APPLICATION_JSON)
    public String getRandomAnimal() {
        
        List<Animal> animal = new ArrayList(); 
        
        animal.add (new Animal("Lion", 1996, "Raw")); 
        animal.add(new Animal("Tiger", 1996, "Raw"));
        animal.add(new Animal("Jaguar", 1996, "Raw")); 
        Random rnd = new Random();
        
        Animal random1 = animal.get(rnd.nextInt(animal.size()));
        
        
        return "hello there animal" + new Gson().toJson("Random"); 
    }
}
