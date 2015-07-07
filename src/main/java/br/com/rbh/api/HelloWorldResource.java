package br.com.rbh.api;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import com.google.gson.Gson;

import br.com.rbh.response.DefaultResponse;

@Path("hello_world")
public class HelloWorldResource {

	@GET
	@Produces(MediaType.APPLICATION_JSON + ";charset=utf-8")
	public Response helloWorld() {
		Gson gson = new Gson();
		
		return Response.status(Status.OK)
				.entity(gson.toJson(new DefaultResponse("Hello World!"))).build();
	}
}
