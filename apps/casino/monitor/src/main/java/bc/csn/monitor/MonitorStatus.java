package bc.csn.monitor;

import bc.csn.essential.ROULETTE_NAME;
import bc.csn.essential.MONITOR_STATUS;
import javax.json.bind.annotation.JsonbProperty;

public class MonitorStatus {

    @JsonbProperty(value = "roulette-name")
    private ROULETTE_NAME rouletteName = ROULETTE_NAME.UNDEFINED;

    @JsonbProperty(value = "status")
    private MONITOR_STATUS status = MONITOR_STATUS.UNDEFINED;

    @JsonbProperty(value = "message")
    private String message = "";

    MonitorStatus(ROULETTE_NAME rouletteName, MONITOR_STATUS monitorStatus, String message) {
        this.rouletteName = rouletteName;
        this.status = monitorStatus;
        this.message = message;
    }

    public MONITOR_STATUS getStatus() {
        return status;
    }

    public String getMessage() {
        return message;
    }

    public ROULETTE_NAME getRouletteName() {
        return rouletteName;
    }

}
