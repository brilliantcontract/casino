package bc.csn.history;

import java.io.StringWriter;
import javax.json.bind.Jsonb;
import javax.json.bind.JsonbBuilder;

import bc.csn.history.spin_enums.Color;
import bc.csn.history.spin_enums.Parity;
import bc.csn.history.spin_enums.Range;
import java.sql.Timestamp;
import java.time.LocalDateTime;

public class Spin {

    private final Number number;
    private final Integer sequence;
    private final Color color;
    private final Timestamp timestamp;
    private final Parity parity;
    private final Range range;

    private final NumberRecognizer numberNomenclature = new NumberRecognizer();

    public Spin(Number number, Integer sequence)
            throws NumberFormatException, NullPointerException {
        if (number == null) {
            throw new NullPointerException("Number is null.");
        }

        if (sequence == null) {
            throw new NullPointerException("Sequence is null");
        }

        this.number = number;
        this.sequence = sequence;
        this.color = numberNomenclature.recognizeColor(number);
        this.timestamp = Timestamp.valueOf(LocalDateTime.now());
        this.parity = numberNomenclature.recognizeParity(number);
        this.range = numberNomenclature.recognizeRange(number);
    }

    public Number getNumber() {
        return number;
    }

    public Color getColor() {
        return color;
    }

    public Integer getSequence() {
        return sequence;
    }

    public Timestamp getTimestamp() {
        return timestamp;
    }

    public Parity getParity() {
        return parity;
    }

    public Range getRange() {
        return range;
    }

    public String asJson() {
        Jsonb jsonb = JsonbBuilder.create();
        String json = jsonb.toJson(this);

        return json;
    }

}
