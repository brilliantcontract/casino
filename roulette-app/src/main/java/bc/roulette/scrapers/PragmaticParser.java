package bc.roulette.scrapers;

import bc.roulette.CriticalException;
import java.io.StringReader;
import java.math.BigDecimal;
import javax.json.Json;
import javax.json.JsonObject;
import javax.json.JsonReader;
import javax.json.JsonArray;

import java.util.ArrayList;
import java.util.List;
import bc.roulette.history.Number;

class PragmaticParser {

    List<Number> parseJson(String textJson)
            throws CriticalException {
        List<Number> numbers = new ArrayList();

        JsonReader jsonReader = Json.createReader(new StringReader(textJson));
        JsonObject jsonObject = jsonReader.readObject();

        String errorCode = jsonObject.getString("errorCode");
        if (!errorCode.equals("0")) {
            throw new CriticalException("JSON returned not zero error code. Error code is " + errorCode);
        }

        JsonArray spins = jsonObject.getJsonArray("history");
        for (int index = 0; index < spins.size(); index++) {
            JsonObject spin = spins.getJsonObject(index);
            Number number = extractNumber(spin);
            numbers.add(number);
        }

        return numbers;
    }

    private Number extractNumber(JsonObject spin) {
        String textNumber = spin.getString("gameResult");
        textNumber = textNumber.replaceAll(" .+", "");

        return new Number(textNumber);
    }

}
