package com.mobiquityinc.sample.jersey;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Sample Jersey REST Service Implementation
 * @author raj
 */
@Path("testresource")
public class MyResource {
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String returnPlainText() {
		return "Success";
	}

    @GET
    @Produces(MediaType.TEXT_HTML)
    public String returnHTML() {
        return "<html>" +
        	   "<title>Test REST response</title>" + 
        	   "<body><h1>Success!</h1></body>" +
        	   "</html>";
    }
}
