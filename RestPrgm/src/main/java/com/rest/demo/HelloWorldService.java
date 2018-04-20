package com.rest.demo;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

@Path("/hello")
public class HelloWorldService {

	@GET
	@Path("/{name}")
	public Response getmsg(@PathParam("name") String name){
		
		String s="hello :" + name;
		return Response.status(200).entity(s).build();
	}
}
