package bc.csn.scrapers.pragmatic;

import bc.csn.history.Number;
import bc.csn.essential.CriticalException;
import java.io.StringReader;
import java.math.BigDecimal;
import javax.json.Json;
import javax.json.JsonObject;
import javax.json.JsonReader;
import javax.json.JsonArray;

import java.util.ArrayList;
import java.util.List;

class PragmaticParser {

    List<Number> parseJson(String textJson)
            throws CriticalException {
        List<Number> numbers = new ArrayList();

        validateJsonCode(textJson);

        JsonReader jsonReader = Json.createReader(new StringReader(textJson));
        JsonObject jsonObject = jsonReader.readObject();

        validateJsonObject(jsonObject);

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

    private void validateJsonCode(String json) throws CriticalException {
        if (json.toUpperCase().contains("<SESSION>OFFLINE</SESSION>")) {
            throw new CriticalException("Session is offline");
        }
    }

    private void validateJsonObject(JsonObject jsonObject) throws CriticalException {
        String errorCode = jsonObject.getString("errorCode");
        if (!errorCode.equals("0")) {
            throw new CriticalException("JSON returned not zero error code. Error code is " + errorCode);
        }
    }

}
