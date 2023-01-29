package bc.csn.monitor.pragmatic;

import bc.csn.essential.MONITOR_STATUS;
import bc.csn.monitor.Monitor;
import bc.csn.monitor.MonitorStatus;
import bc.csn.monitor.MonitorStatusBuilder;
import bc.csn.essential.ROULETTE_NAME;
import bc.csn.scrapers.pragmatic.PragmaticScraper;

import javax.annotation.PostConstruct;
import javax.ejb.LocalBean;
import javax.ejb.Singleton;
import javax.ejb.Startup;

@Startup
@Singleton(name = "pragmatic-monitor")
@LocalBean
public class PragmaticMonitor implements Monitor {

    private MonitorStatus monitorStatus = new MonitorStatusBuilder()
            .setMessage("")
            .setMonitorStatus(MONITOR_STATUS.UNDEFINED)
            .setRouletteName(ROULETTE_NAME.PRAGMATIC_PLAY)
            .createMonitorStatus();
    private final PragmaticScraper scraper = new PragmaticScraper();
    private final PragmaticThread thread = new PragmaticThread(monitorStatus);

    public PragmaticMonitor() {
    }

    @PostConstruct
    public void init() {
        System.out.println("PragmaticMonitor startup bean was initialized.");
    }

    @Override
    public void start() {
        scraper.initialze();

        thread.setScraper(scraper);
        thread.run();

        monitorStatus = new MonitorStatusBuilder()
                .setMessage("")
                .setMonitorStatus(MONITOR_STATUS.RUNNING)
                .setRouletteName(ROULETTE_NAME.PRAGMATIC_PLAY)
                .createMonitorStatus();
    }

    @Override
    public void stop() {
        thread.stop();

        monitorStatus = new MonitorStatusBuilder()
                .setMessage("")
                .setMonitorStatus(MONITOR_STATUS.STOPPED)
                .setRouletteName(ROULETTE_NAME.PRAGMATIC_PLAY)
                .createMonitorStatus();
    }

    @Override
    public MonitorStatus getStatus() {
        return monitorStatus;
    }

}
