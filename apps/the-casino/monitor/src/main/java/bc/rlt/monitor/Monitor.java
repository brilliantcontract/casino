package bc.rlt.monitor;

public interface Monitor {

    public void start();

    public void stop();

    public MonitorStatus getStatus();
}
