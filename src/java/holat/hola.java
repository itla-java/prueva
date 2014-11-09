/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holat;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.PathParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;

/**
 * REST Web Service
 *
 * @author HiraldoTran
 */
@Path("/holatu/")
public class hola {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of hola
     */
    public hola() {
    }

    /**
     * Retrieves representation of an instance of hola.hola
     * @return an instance of java.lang.String
     */
    @GET
    @Produces("application/xml")
    public String getXml() {
        //TODO return proper representation object
        throw new UnsupportedOperationException();
    }
@GET
    @Path("/hola")
    @Produces("text/plane")
    public String holaM(){
        return "<h1>hola mundo por fin</h1>";
    }
    /**
     * PUT method for updating or creating an instance of hola
     * @param content representation for the resource
     * @return an HTTP response with content of the updated or created resource.
     */
    @PUT
    @Consumes("application/xml")
    public void putXml(String content) {
    }
}
