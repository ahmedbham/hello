package com.ahmedbham;

// import java.util.logging.Logger;

// import java.lang.System.Logger;

// import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

// import io.vertx.core.impl.logging.Logger;

// import io.vertx.core.impl.logging.Logger;

@Path("/hello")
public class GreetingResource {

    // @Inject
    // Logger logger;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        // logger.info("logger invoked");
        return "Hello World";
    }
}