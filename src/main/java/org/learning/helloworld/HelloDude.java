package org.learning.helloworld;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

@Path("/hello")
public class HelloDude {

    @GET
    @Path("/{name}")
    public String sayHello(@PathParam("name") String name)
    {
        return "Hi "+name+", Welcome to the World!!!";
    }
    @GET
    @Path("/sayBye")
    public String sayBye()
    {
        return "Bye";
    }
    @GET
    @Path("/as/{id}")
    public String khs(@PathParam("id") Integer id){
        return "Kendi Hundi Si...";
    }
}
