package com.lakeshoremarketplace.controller;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/employee")
public class CustomerController {

	@GET
    @Produces({"application/json"})
	@Path("/example")
	public String getDummyEmployee() {
		return "success.";
	}
}
