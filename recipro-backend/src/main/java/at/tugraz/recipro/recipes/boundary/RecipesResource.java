/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package at.tugraz.recipro.recipes.boundary;

import at.tugraz.recipro.recipes.control.RecipesManager;
import at.tugraz.recipro.recipes.entity.Recipe;
import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author Dominik
 */
@Path("recipes")
@Stateless
public class RecipesResource {
    
    @Inject
    RecipesManager recipesManager;
    
    @POST
    public void create(Recipe recipe) {
        recipesManager.save(recipe);
    }
    
    @GET
    @Path("{title}")
    public List<Recipe> find(@PathParam("title") String title) {
        return recipesManager.findByTitle(title);
    }
    
    @GET
    @Path("all")
    public List<Recipe> findAll() {
        return recipesManager.findAll();
    }
}
