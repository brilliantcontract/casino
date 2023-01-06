package bc.roulette.face;

import bc.roulette.Config;
import bc.roulette.scrapers.PragmaticScraper;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {

    private final Config config = Config.create();
    private final ArgumentsParser argumentsParser = new ArgumentsParser();

    public static void main(String[] args) {
        new Main().run(args);
    }

    private void run(String[] args) {
        argumentsParser.parse(args);

        if (config.getRouletteNameForMonitoring()
                .toUpperCase().contains("PRAGMATIC")) {
            PragmaticScraper pragmaticScraper = new PragmaticScraper();
            pragmaticScraper.initialze();
            pragmaticScraper.startMonitoring();
        }

        infiniteSleep();
        System.out.println("Roulette application was closed.");
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }

    private void infiniteSleep() {
        try {
            Thread.currentThread().join();
        } catch (InterruptedException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
