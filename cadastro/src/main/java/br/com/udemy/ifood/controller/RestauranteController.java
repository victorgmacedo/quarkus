package br.com.udemy.ifood.controller;

import br.com.udemy.ifood.model.Restaurante;

import javax.transaction.Transactional;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/restaurantes")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class RestauranteController {

    @GET
    public List<Restaurante> findAll(){
        return Restaurante.listAll();
    }

    @POST
    @Transactional
    public Restaurante save(Restaurante restaurante){
        restaurante.persist();
        return restaurante;
    }

}
