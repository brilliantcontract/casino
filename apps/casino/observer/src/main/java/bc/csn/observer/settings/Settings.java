package bc.csn.observer.settings;

import javax.json.Json;
import javax.json.JsonObject;
import javax.json.JsonReader;
import javax.json.JsonArray;

import javax.json.bind.Jsonb;
import javax.json.bind.JsonbBuilder;

import java.util.ArrayList;
import java.util.List;
import javax.json.bind.annotation.JsonbProperty;

public class Settings {
    @JsonbProperty("processed-spins-setting")
    Integer processedSpinsSetting;

    @JsonbProperty("color-columns-setting")
    Integer colorColumnsSetting;

    @JsonbProperty("parity-columns-setting")
    Integer parityColumnsSetting;

    @JsonbProperty("range-columns-setting")
    Integer rangeColumnsSetting;

    @JsonbProperty("field-height-setting")
    Integer fieldHeightSetting;

    @JsonbProperty("hide-0-setting")
    String hide0Setting;

    @JsonbProperty("warning-fire-setting")
    Integer warningFireSetting;

    @JsonbProperty("success-fire-setting")
    Integer successFireSetting;
    
    public String asJson() {
        Jsonb jsonb = JsonbBuilder.create();
        String json = jsonb.toJson(this);
        
        return json;
    }
}
