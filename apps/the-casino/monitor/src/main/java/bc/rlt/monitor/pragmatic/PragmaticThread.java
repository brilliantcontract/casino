package bc.rlt.monitor.pragmatic;

import bc.rlt.essential.MONITOR_STATUS;
import bc.rlt.monitor.MonitorStatus;
import bc.rlt.monitor.MonitorStatusBuilder;
import bc.rlt.essential.ROULETTE_NAME;
import bc.rlt.monitor.Monitor;
import bc.rlt.scrapers.pragmatic.PragmaticScraper;

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
                    .setRouletteName(ROULETTE_NAME.PRAGMATIC)
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
