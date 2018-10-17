package com.github.srang.apblab.web;

import javax.json.Json;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/cookie")
public class CookieEndpoint {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response listInventory() {
        return Response.ok(Json.createObjectBuilder()
                .add("msg","No cookies in inventory").build()
        ).build();
    }
}