package com.raghu.junitcxf;

import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

@Path("/chat")
@Produces("application/json")
public interface ChatWebService {

    @POST
    @Path("connect")
    public Response connect(@FormParam("user") String username, @FormParam("pass") String password);

}
