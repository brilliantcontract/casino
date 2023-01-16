package bc.rlt.essential;

class RouletteTableConfigBuilder {

    private ROULETTE_NAME roulette = ROULETTE_NAME.UNDEFINED;
    private String table = "";
    private String httpId = "";
    private String wsId = "";
    private String server = "";

    RouletteTableConfigBuilder setRoulette(ROULETTE_NAME roulette) {
        this.roulette = roulette;
        return this;
    }

    RouletteTableConfigBuilder setTable(String table) {
        this.table = table;
        return this;
    }

    RouletteTableConfigBuilder setHttpId(String httpId) {
        this.httpId = httpId;
        return this;
    }

    RouletteTableConfigBuilder setWsId(String wsId) {
        this.wsId = wsId;
        return this;
    }
    
    RouletteTableConfig create() {
        return new RouletteTableConfig(roulette, table, httpId, wsId, server);
    }

    RouletteTableConfigBuilder setServer(String server) {
        this.server = server;
        return this;
    }
}
