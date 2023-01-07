package bc.rlt.monitor;

import bc.rlt.essential.ROULETTE_NAME;
import bc.rlt.essential.MONITOR_STATUS;

public class MonitorStatusBuilder {

    private ROULETTE_NAME rouletteName;
    private MONITOR_STATUS monitorStatus;
    private String message;

    public MonitorStatusBuilder() {
    }

    public MonitorStatusBuilder setRouletteName(ROULETTE_NAME rouletteName) {
        this.rouletteName = rouletteName;
        return this;
    }

    public MonitorStatusBuilder setMonitorStatus(MONITOR_STATUS monitorStatus) {
        this.monitorStatus = monitorStatus;
        return this;
    }

    public MonitorStatusBuilder setMessage(String message) {
        this.message = message;
        return this;
    }

    public MonitorStatus createMonitorStatus() {
        return new MonitorStatus(rouletteName, monitorStatus, message);
    }

}
