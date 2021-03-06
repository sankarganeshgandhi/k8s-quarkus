package org.acme.kafka;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/producer1")
@Consumes(MediaType.TEXT_PLAIN)
@Produces(MediaType.TEXT_PLAIN)
public class Resource1 {
    @Inject
    Producer1 producer1;
    
    @POST
    public Response send(String msgEvent) {
        producer1.sendMessage(msgEvent);
        // Return an 202 - Accepted response.
        return Response.accepted().build();
    }
}