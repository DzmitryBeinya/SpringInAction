package chapter2;

import java.util.Collection;
import java.util.Map;

/**
 * Created by dzbe1116 on 4/10/2017.
 */
public class OneManBand implements Performer {

    public OneManBand() {
    }

    private Map<String, Instrument> instruments;

    public void setInstruments(Map<String, Instrument> instruments) {
        this.instruments = instruments; // Внедрение инструментов в виде
    }

    @Override
    public void perform() {
        for (String key : instruments.keySet()) {
            System.out.print(key + " : ");
            Instrument instrument = instruments.get(key);
            instrument.play();
        }
    }
}
