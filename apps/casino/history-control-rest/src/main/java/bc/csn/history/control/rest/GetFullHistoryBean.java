package bc.csn.history.control.rest;

import bc.csn.essential.Config;
import bc.csn.essential.CriticalException;
import bc.csn.essential.ROULETTE_NAME;
import bc.csn.essential.RouletteTableConfig;
import bc.csn.essential.RouletteTableConfigBuilder;
import bc.csn.history.Histories;
import bc.csn.history.History;
import bc.csn.history.Spin;
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
            RouletteTableConfig tableConfig = new RouletteTableConfigBuilder()
                        .setRoulette(ROULETTE_NAME.PRAGMATIC_PLAY)
                        .setTable("Mega Roulette")
                        .setHttpId("1hl65ce1lxuqdrkr")
                        .setWsId("2169334708")
                        .setServer("gs8.pragmaticplaylive.net")
                        .create();
            histories.addPragmatic(tableConfig);
        }

        History history = histories.getHistory(tableName);

        if (Config.IS_DEBUG_MODE) {
            addFakeNumbersToHistory(history);
        }

        String json = history.asJson();

        return json;
    }

    private void addFakeNumbersToHistory(History history) throws CriticalException {
        List<bc.csn.history.Number> newNumbers = new ArrayList<>();
        
        newNumbers.add(new bc.csn.history.Number(generateRandomInteger()));
        newNumbers.add(new bc.csn.history.Number(generateRandomInteger()));
        newNumbers.add(new bc.csn.history.Number(generateRandomInteger()));
        newNumbers.add(new bc.csn.history.Number(generateRandomInteger()));
        newNumbers.add(new bc.csn.history.Number(generateRandomInteger()));
        newNumbers.add(new bc.csn.history.Number(generateRandomInteger()));
        newNumbers.add(new bc.csn.history.Number(generateRandomInteger()));
        newNumbers.add(new bc.csn.history.Number(generateRandomInteger()));
        newNumbers.add(new bc.csn.history.Number(generateRandomInteger()));
        newNumbers.add(new bc.csn.history.Number(generateRandomInteger()));
        
        history.append(newNumbers);
    }
    
    private int generateRandomInteger() {
        int min = 0;
        int max = 32;
        
        int randomNumber = (int)(Math.random() * (max - min + 1) + min);
        
        return randomNumber;
    }

}
