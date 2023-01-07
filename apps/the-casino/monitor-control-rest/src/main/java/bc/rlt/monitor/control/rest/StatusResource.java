package bc.rlt.monitor.control.rest;

import bc.rlt.essential.MONITOR_STATUS;
import bc.rlt.monitor.MonitorStatus;
import bc.rlt.monitor.MonitorStatusBuilder;
import bc.rlt.essential.ROULETTE_NAME;
import bc.rlt.monitor.pragmatic.PragmaticMonitor;
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

/**
 * REST Web Service
 */
@Path("status")
public class StatusResource {
    
    @EJB(beanName = "pragmatic-monitor")
    PragmaticMonitor pragmaticMonitor;

    @Context
    private UriInfo context;

    public StatusResource() {
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<MonitorStatus> getJson() {
        List<MonitorStatus> statuses = new ArrayList<>();
        
        statuses.add(pragmaticMonitor.getStatus());
        statuses.add(
                new MonitorStatusBuilder()
                        .setMessage("My test message.")
                        .setMonitorStatus(MONITOR_STATUS.STOPPED)
                        .setRouletteName(ROULETTE_NAME.EVOLUTION)
                        .createMonitorStatus()
        );

        return statuses;
    }

}
