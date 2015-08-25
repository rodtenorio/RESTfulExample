package com.oracle.csm.webservice;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/RESTfulTemplate")
public class RESTfulTemplate {

    @GET
    @Path("sayHello")
    @Produces("text/plain")
    public String getHello() {
        return "Hello!!!";
    }
    
//    
//    @PUT
//    @Path("save")
//    @PathParam("{param}")
//    public void save() {
//        
//    }
}
