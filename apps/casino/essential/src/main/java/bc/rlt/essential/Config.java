package bc.csn.essential;

import bc.csn.essential.sessions.WebsiteSessionsManager;
import java.util.ArrayList;
import java.util.List;

public class Config {

    public static Boolean IS_DEBUG_MODE = true;

    public static Integer NUMBER_OF_SPINS_TO_ANALYZE = 20;
    public static Integer NUMBER_OF_SPINS_TO_MATCH = 5;
    public static Integer TOTAL_NUMBER_OF_SPINS_IN_PRAGMATIC_HISTORY = 500;

    public static Integer NUMBER_OF_TRIES_TO_DOWNLOAD_CRITICAL_FILE = 20;
    public static Integer SLEEP_BETWEEN_DOWNLOAD_CRITICAL_FILE_TRIES = 5_000;

    private static Config config = null;
    private final List<String> rouletteWebsiteSessionIds = new ArrayList<>();
    public static final List<RouletteTableConfig> ROULETTE_TABLES_CONFIGS = new ArrayList();

    private String pragmaticJsessionid = "";

    public static Config create() {
        if (Config.config == null) {
            Config.config = new Config();
        }

        return config;
    }

    private Config() {
        ROULETTE_TABLES_CONFIGS.add(
                new RouletteTableConfigBuilder()
                        .setRoulette(ROULETTE_NAME.PRAGMATIC_PLAY)
                        .setTable("Mega Roulette")
                        .setHttpId("1hl65ce1lxuqdrkr")
                        .setWsId("2169334708")
                        .setServer("gs8.pragmaticplaylive.net")
                        .create()
        );
        ROULETTE_TABLES_CONFIGS.add(
                new RouletteTableConfigBuilder()
                        .setRoulette(ROULETTE_NAME.PRAGMATIC_PLAY)
                        .setTable("Roulette 1 - Azure")
                        .setHttpId("g03y1t9vvuhrfytl")
                        .setWsId("2345021705")
                        .setServer("gs8.pragmaticplaylive.net")
                        .create()
        );
        ROULETTE_TABLES_CONFIGS.add(
                new RouletteTableConfigBuilder()
                        .setRoulette(ROULETTE_NAME.PRAGMATIC_PLAY)
                        .setTable("Speed Roulette 1")
                        .setHttpId("fl9knouu0yjez2wi")
                        .setWsId("2345044305")
                        .setServer("gs5.pragmaticplaylive.net")
                        .create()
        );
        ROULETTE_TABLES_CONFIGS.add(
                new RouletteTableConfigBuilder()
                        .setRoulette(ROULETTE_NAME.PRAGMATIC_PLAY)
                        .setTable("Roulette 2")
                        .setHttpId("1hl65ce1lxuqdrkr")
                        .setWsId("2345052305")
                        .setServer("gs8.pragmaticplaylive.net")
                        .create()
        );
        ROULETTE_TABLES_CONFIGS.add(
                new RouletteTableConfigBuilder()
                        .setRoulette(ROULETTE_NAME.PRAGMATIC_PLAY)
                        .setTable("Auto-Roulette 1")
                        .setHttpId("5bzl2835s5ruvweg")
                        .setWsId("2169333808")
                        .setServer("gs8.pragmaticplaylive.net")
                        .create()
        );
        ROULETTE_TABLES_CONFIGS.add(
                new RouletteTableConfigBuilder()
                        .setRoulette(ROULETTE_NAME.PRAGMATIC_PLAY)
                        .setTable("Roulette 3 - Macao")
                        .setHttpId("yqpz3ichst2xg439")
                        .setWsId("2345005505")
                        .setServer("gs5.pragmaticplaylive.net")
                        .create()
        );
        ROULETTE_TABLES_CONFIGS.add(
                new RouletteTableConfigBuilder()
                        .setRoulette(ROULETTE_NAME.PRAGMATIC_PLAY)
                        .setTable("Roulette 8 - Indian")
                        .setHttpId("rmycjoqq18k2r161")
                        .setWsId("2345057105")
                        .setServer("gs5.pragmaticplaylive.net")
                        .create()
        );
        ROULETTE_TABLES_CONFIGS.add(
                new RouletteTableConfigBuilder()
                        .setRoulette(ROULETTE_NAME.PRAGMATIC_PLAY)
                        .setTable("Roulette 9 - The Club")
                        .setHttpId("geogamingh2rw545")
                        .setWsId("2345014105")
                        .setServer("gs5.pragmaticplaylive.net")
                        .create()
        );
        ROULETTE_TABLES_CONFIGS.add(
                new RouletteTableConfigBuilder()
                        .setRoulette(ROULETTE_NAME.PRAGMATIC_PLAY)
                        .setTable("Roulette 10 - Ruby")
                        .setHttpId("chroma229rwltr22")
                        .setWsId("2345059405")
                        .setServer("gs5.pragmaticplaylive.net")
                        .create()
        );
        ROULETTE_TABLES_CONFIGS.add(
                new RouletteTableConfigBuilder()
                        .setRoulette(ROULETTE_NAME.PRAGMATIC_PLAY)
                        .setTable("PowerUP Roulette")
                        .setHttpId("powruprw1qm3xc25")
                        .setWsId("2261059910")
                        .setServer("gs10.pragmaticplaylive.net")
                        .create()
        );
        ROULETTE_TABLES_CONFIGS.add(
                new RouletteTableConfigBuilder()
                        .setRoulette(ROULETTE_NAME.PRAGMATIC_PLAY)
                        .setTable("Speed Roulette 2")
                        .setHttpId("r20speedrtwo201s")
                        .setWsId("2345047405")
                        .setServer("gs8.pragmaticplaylive.net")
                        .create()
        );
    }

    public void setRouletteWebsiteSessionId(List<String> rouletteWebsiteSessionId) {
        this.rouletteWebsiteSessionIds.clear();
        this.rouletteWebsiteSessionIds.addAll(rouletteWebsiteSessionId);

        updateWebsiteSessionsManager();
    }

    public void setRouletteWebsiteSessionId(String rouletteWebsiteSessionId) {
        this.rouletteWebsiteSessionIds.clear();
        this.rouletteWebsiteSessionIds.add(rouletteWebsiteSessionId);

        updateWebsiteSessionsManager();
    }

    private void updateWebsiteSessionsManager() {
        WebsiteSessionsManager websiteSessionsManager = WebsiteSessionsManager.create();

        websiteSessionsManager.update(rouletteWebsiteSessionIds);
    }

    public String getPragmaticJsessionid() {
        return pragmaticJsessionid;
    }

    public void setPragmaticJsessionid(String pragmaticJsessionid) {
        this.pragmaticJsessionid = pragmaticJsessionid;
    }

}
