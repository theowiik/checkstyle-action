package com.theowiik.catter.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

/**
 * This is a resource file.
 */
@Path("javaee8")
public class JavaEnterprise8Resource {

  /**
   * Some javadoc.
   *
   * @return the response.
   */
  @GET
  public Response ping() {
    return Response
        .ok("ping")
        .build();
  }
}
