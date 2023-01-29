package bc.csn.monitor.pragmatic;

import bc.csn.essential.MONITOR_STATUS;
import bc.csn.monitor.MonitorStatus;
import bc.csn.monitor.MonitorStatusBuilder;
import bc.csn.essential.ROULETTE_NAME;
import bc.csn.monitor.Monitor;
import bc.csn.scrapers.pragmatic.PragmaticScraper;

public class PragmaticThread implements Runnable {

    private MonitorStatus monitorStatus;
    private PragmaticScraper scraper;
    private Boolean stopThread = false;

    public PragmaticThread(MonitorStatus monitorStatus) {
        this.monitorStatus = monitorStatus;
    }

    public void setScraper(PragmaticScraper scraper) {
        this.scraper = scraper;
    }

    @Override
    public void run() {
        try {
            while (true) {
                infiniteMonitorCycle();

                if (this.stopThread) {
                    this.stopThread = false;
                    break;
                }
            }
        } catch (Exception ex) {
            this.monitorStatus = new MonitorStatusBuilder()
                    .setMessage(ex.getMessage())
                    .setMonitorStatus(MONITOR_STATUS.FAILED)
                    .setRouletteName(ROULETTE_NAME.PRAGMATIC_PLAY)
                    .createMonitorStatus();
        }
    }

    private void infiniteMonitorCycle() throws Exception {
        System.out.println("do something");
        Thread.sleep(3_000);
        // scrape data
    }

    void stop() {
        this.stopThread = true;
    }

}
