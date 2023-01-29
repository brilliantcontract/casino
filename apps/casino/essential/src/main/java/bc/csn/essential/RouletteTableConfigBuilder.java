package bc.csn.essential;

public class RouletteTableConfigBuilder {

    private ROULETTE_NAME roulette = ROULETTE_NAME.UNDEFINED;
    private String table = "";
    private String httpId = "";
    private String wsId = "";
    private String server = "";

    public RouletteTableConfigBuilder setRoulette(ROULETTE_NAME roulette) {
        this.roulette = roulette;
        return this;
    }

    public RouletteTableConfigBuilder setTable(String table) {
        this.table = table;
        return this;
    }

    public RouletteTableConfigBuilder setHttpId(String httpId) {
        this.httpId = httpId;
        return this;
    }

    public RouletteTableConfigBuilder setWsId(String wsId) {
        this.wsId = wsId;
        return this;
    }
    
    public RouletteTableConfig create() {
        return new RouletteTableConfig(roulette, table, httpId, wsId, server);
    }

    public RouletteTableConfigBuilder setServer(String server) {
        this.server = server;
        return this;
    }
}
