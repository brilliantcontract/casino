package bc.csn.strategy.service;

import bc.csn.essential.Config;
import bc.csn.essential.CriticalException;
import bc.csn.essential.ROULETTE_NAME;
import bc.csn.essential.StrategyTarget;
import bc.csn.history.Histories;
import bc.csn.history.History;
import bc.csn.history.Spin;
import bc.csn.history.Queue;
import bc.csn.strategies.Field;
import bc.csn.strategies.RouletteMirrorStrategy;
import bc.csn.strategies.RouletteMirrorStrategyDemo;
import bc.csn.strategies.Strategy;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.Stateless;
import javax.ejb.LocalBean;
import javax.ejb.Startup;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.DELETE;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path("/strategy/roulette-mirror-strategy/{strategy-target}/{table-name}")
@Stateless(name = "roulette-mirror-strategy-rest")
public class RouletteMirrorStrategyRest {

    private final Histories histories = Histories.create();

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String calculate(@PathParam("strategy-target") String strategyTarget,
            @PathParam("table-name") String tableName
    ) throws CriticalException {
        return new RouletteMirrorStrategyDemo().calculate(strategyTarget, tableName);
    }

}
