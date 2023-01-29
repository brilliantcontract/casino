package bc.csn.monitor.control;

import static com.opensymphony.xwork2.Action.SUCCESS;
import com.opensymphony.xwork2.ActionSupport;

public class StartMonitorAction extends ActionSupport {
    private static final long serialVersionUID = 1L;
    
    @Override
    public String execute() throws Exception {
        System.out.println("Hello from StartMonitorAction class.");

        return SUCCESS;
    }
}
