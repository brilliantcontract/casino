package bc.rlt.history.control.rest;

import bc.rlt.essential.Config;
import bc.rlt.essential.CriticalException;
import bc.rlt.history.Histories;
import bc.rlt.history.History;
import bc.rlt.history.Spin;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import javax.ejb.Stateless;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.DELETE;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path("/get-full-history/{table-name}")
@Stateless(name = "history-web-service-bean")
public class GetFullHistoryBean {

    private Histories histories = Histories.create();

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String getFullHistory(@PathParam("table-name") String tableName) throws CriticalException {
        if (Config.IS_DEBUG_MODE) {
            histories.addPragmatic("Mega Roulette", "1hl65ce1lxuqdrkr");
        }

        History history = histories.getHistory(tableName);

        if (Config.IS_DEBUG_MODE) {
            addFakeNumbersToHistory(history);
        }

        String json = history.asJson();

        return json;
    }

    private void addFakeNumbersToHistory(History history) throws CriticalException {
        List<bc.rlt.history.Number> newNumbers = new ArrayList<>();
        
        newNumbers.add(new bc.rlt.history.Number(generateRandomInteger()));
        newNumbers.add(new bc.rlt.history.Number(generateRandomInteger()));
        newNumbers.add(new bc.rlt.history.Number(generateRandomInteger()));
        newNumbers.add(new bc.rlt.history.Number(generateRandomInteger()));
        newNumbers.add(new bc.rlt.history.Number(generateRandomInteger()));
        newNumbers.add(new bc.rlt.history.Number(generateRandomInteger()));
        newNumbers.add(new bc.rlt.history.Number(generateRandomInteger()));
        newNumbers.add(new bc.rlt.history.Number(generateRandomInteger()));
        newNumbers.add(new bc.rlt.history.Number(generateRandomInteger()));
        newNumbers.add(new bc.rlt.history.Number(generateRandomInteger()));
        
        history.append(newNumbers);
    }
    
    private int generateRandomInteger() {
        int min = 0;
        int max = 32;
        
        int randomNumber = (int)(Math.random() * (max - min + 1) + min);
        
        return randomNumber;
    }

}
