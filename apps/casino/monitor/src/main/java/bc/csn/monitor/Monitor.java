package bc.csn.monitor;

public interface Monitor {

    public void start();

    public void stop();

    public MonitorStatus getStatus();
}
