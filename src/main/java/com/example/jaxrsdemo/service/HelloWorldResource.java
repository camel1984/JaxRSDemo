package com.example.jaxrsdemo.service;

import com.example.jaxrsdemo.model.Product;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

/**
 * @author Pavel Bucek
 */
@Path("helloworld")
public class HelloWorldResource {

    @GET
    @Produces("text/plain")
    public String getHello() {
        return "Hello World! this is from rest server api.";
    }

    @GET
    @Path("/{name}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getProduct(@PathParam("name") String name) {
        // Create a dummy product for demonstration
        Product product = new Product(name, 99.99);

        // Return the product as a JSON response
        return Response.ok(product).build();
    }
}