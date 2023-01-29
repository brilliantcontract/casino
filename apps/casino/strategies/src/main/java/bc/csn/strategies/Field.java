package bc.csn.strategies;

import bc.csn.essential.ROULETTE_NAME;
import bc.csn.essential.StrategyTarget;
import bc.csn.history.Spin;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import javax.json.bind.Jsonb;
import javax.json.bind.JsonbBuilder;

public class Field {

    private ROULETTE_NAME rouletteName;
    private String tableName;
    private StrategyTarget strategyTarget;
    public Cells cells = new Cells();

    public ROULETTE_NAME getRouletteName() {
        return rouletteName;
    }

    public void setRouletteName(ROULETTE_NAME rouletteName) {
        this.rouletteName = rouletteName;
    }

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public StrategyTarget getStrategyTarget() {
        return strategyTarget;
    }

    public void setStrategyTarget(StrategyTarget strategyTarget) {
        this.strategyTarget = strategyTarget;
    }

    public String asJson() {
        Jsonb jsonb = JsonbBuilder.create();
        String json = jsonb.toJson(this);

        return json;
    }

}
