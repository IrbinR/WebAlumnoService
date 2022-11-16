/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/WebServices/GenericResource.java to edit this template
 */
package pe.idat.ec3.irbin.salazar.rest;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;
import pe.idat.ec3.irbin.salazar.dao.AlumnoDao;
import pe.idat.ec3.irbin.salazar.vo.Alumno;

/**
 * REST Web Service
 *
 * @author irbin
 */
@Path("alumno")
public class Alumnorest {

    @Context
    private UriInfo context;
    
    AlumnoDao alumnoDao = new AlumnoDao();
    
    public Alumnorest() {
    }
    
    @GET
    @Path("BuscarPorNombre/{nombre}/{limite}")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Alumno> buscarPorNombre(@PathParam("nombre")String nombre,@PathParam("limite")int limite){
         List<Alumno> lista = new ArrayList<>();
         lista = alumnoDao.buscarPorNombre(nombre);
         return lista.stream().limit(limite).collect(Collectors.toList());
         
         
    }

    
}
