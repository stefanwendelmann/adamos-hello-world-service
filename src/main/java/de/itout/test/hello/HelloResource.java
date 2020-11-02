package de.itout.test.hello;

import javax.ws.rs.*;
import javax.ws.rs.core.*;

/**
 *
 * @author shoeltker
 */
@Path("/hello")
public class HelloResource
{

  @GET
  @Produces(MediaType.TEXT_PLAIN)
  public String hello()
  {
    return "Hello World ADAMOS";
  }

}
