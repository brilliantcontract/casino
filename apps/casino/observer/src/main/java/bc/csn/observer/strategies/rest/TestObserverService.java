package bc.csn.observer.strategies.rest;

import bc.csn.strategies.RouletteMirrorStrategy;
import java.util.ArrayList;
import java.util.List;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.core.MediaType;
import javax.ejb.EJB;
import javax.ws.rs.PathParam;

@Path("/test-observer-service")
public class TestObserverService {
    
    @EJB(beanName = "roulette-mirror-strategy")
    RouletteMirrorStrategy rouletteMirrorStrategy;

    public TestObserverService() {
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("{message}")
    public String getTest(@PathParam("message") String message) {
        String echo = "{\"echo\":\"" + message.replace("\"", "\\\"") + "\"}";
        
        System.out.println("Time: " + rouletteMirrorStrategy.getLocalDateTime());

        return echo;
    }

}
