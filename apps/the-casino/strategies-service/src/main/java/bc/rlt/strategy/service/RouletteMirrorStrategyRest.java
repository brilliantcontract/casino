package bc.rlt.strategy.service;

import bc.rlt.essential.Config;
import bc.rlt.essential.CriticalException;
import bc.rlt.essential.ROULETTE_NAME;
import bc.rlt.essential.StrategyTarget;
import bc.rlt.history.Histories;
import bc.rlt.history.History;
import bc.rlt.history.Spin;
import bc.rlt.history.Queue;
import bc.rlt.strategies.Field;
import bc.rlt.strategies.RouletteMirrorStrategy;
import bc.rlt.strategies.RouletteMirrorStrategyDemo;
import bc.rlt.strategies.Strategy;
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
