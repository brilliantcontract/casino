package bc.roulette;

import java.util.HashMap;
import java.util.Map;

public class Config {

    public static Integer NUMBER_OF_SPINS_TO_ANALYZE = 20;
    public static Integer NUMBER_OF_SPINS_TO_MATCH = 5;
    public static Integer TOTAL_NUMBER_OF_SPINS_IN_PRAGMATIC_HISTORY = 20;
    
    public static Integer NUMBER_OF_TRIES_TO_DOWNLOAD_CRITICAL_FILE = 20;
    public static Integer SLEEP_BETWEEN_DOWNLOAD_CRITICAL_FILE_TRIES = 5_000;
    
    private static Config config = null;
    private String rouletteWebsiteSessionId = null;
    private String rouletteNameForMonitoring = null;
    
    public static final String PRAGMATIC_ROULETTE_NAME = "Pragmatic";
    public static final Map<String, String> PRAGMATIC_TABLE_IDS = new HashMap();
    
    public static Config create() {
        if (Config.config == null) {
            Config.config = new Config();
        }

        return config;
    }

    private Config() {
        PRAGMATIC_TABLE_IDS.put("Mega Roulette", "1hl65ce1lxuqdrkr");
        PRAGMATIC_TABLE_IDS.put("Roulette 1 - Azure", "g03y1t9vvuhrfytl");
        PRAGMATIC_TABLE_IDS.put("Speed Roulette 1", "fl9knouu0yjez2wi");
        PRAGMATIC_TABLE_IDS.put("Roulette 2", "5kvxlw4c1qm3xcyn");
        PRAGMATIC_TABLE_IDS.put("Auto-Roulette 1", "5bzl2835s5ruvweg");
        PRAGMATIC_TABLE_IDS.put("Roulette 3 - Macao", "yqpz3ichst2xg439");
        PRAGMATIC_TABLE_IDS.put("Roulette 8 - Indian", "rmycjoqq18k2r161");
        PRAGMATIC_TABLE_IDS.put("Roulette 9 - The Club", "geogamingh2rw545");
        PRAGMATIC_TABLE_IDS.put("Roulette 10 - Ruby", "chroma229rwltr22");
    }

    public String getRouletteWebsiteSessionId() {
        return this.rouletteWebsiteSessionId;
    }

    public void setRouletteWebsiteSessionId(String rouletteWebsiteSessionId) {
        this.rouletteWebsiteSessionId = rouletteWebsiteSessionId;
    }

    public String getRouletteNameForMonitoring() {
        return rouletteNameForMonitoring;
    }

    public void setRouletteNameForMonitoring(String rouletteNameForMonitoring) {
        this.rouletteNameForMonitoring = rouletteNameForMonitoring;
    }

}
