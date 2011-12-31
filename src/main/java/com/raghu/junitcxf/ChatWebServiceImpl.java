package com.raghu.junitcxf;

import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

@Produces("application/json")
public class ChatWebServiceImpl implements ChatWebService {

    public Response connect(String username, String password) {
        if (username == null || "".equals(username) || password == null || "".equals(password)) {
            return Response.status(Status.BAD_REQUEST).build();
        }
        String[] response = { username, password };
        return Response.ok(response).build();
    }
}
