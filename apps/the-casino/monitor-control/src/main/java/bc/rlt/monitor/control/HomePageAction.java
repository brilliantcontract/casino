package bc.rlt.monitor.control;

import static com.opensymphony.xwork2.Action.SUCCESS;
import com.opensymphony.xwork2.ActionSupport;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class HomePageAction extends ActionSupport {

    private static final long serialVersionUID = 1L;

//    private Map<String, String> roulettes;
    private List<String> roulettes;
    private String roulette = "";

    private String msg = "Struts 2 is a funny framework";

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    @Override
    public String execute() throws Exception {
        System.out.println("Hello from HomePageAction class.");
        return SUCCESS;
    }

    @Override
    public String input() throws Exception {
        return SUCCESS;
    }

//    public Map<String, String> getRoulettes() {
//        roulettes = new TreeMap<>();
//
//        roulettes.put("PRAGMATIC", "Pragmatic");
//        roulettes.put("EVOLUTION", "Evolution");
//
//        return roulettes;
//    }
    public List<String> getRoulettes() {
        roulettes = new ArrayList<>();

        roulettes.add("PRAGMATIC");
        roulettes.add("EVOLUTION");

        return roulettes;
    }

//    public void setRoulettes(Map<String, String> roulettes) {
//        this.roulettes = roulettes;
//    }
    public void setRoulettes(List<String> roulettes) {
        this.roulettes = roulettes;
    }

    public String getRoulette() {
        return roulette;
    }

    public void setRoulette(String roulette) {
        this.roulette = roulette;
    }

}
