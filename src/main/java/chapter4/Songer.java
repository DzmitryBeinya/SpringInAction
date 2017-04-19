package chapter4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.inject.Inject;
import javax.inject.Named;

/**
 * Created by dzbe1116 on 4/14/2017.
 */
@Component
public class Songer implements Performer {
    @Override
    public void perform() {
        System.out.println("Songer performs with " + instrument.play()
                + " " + song);
    }

    @Inject
    public Songer(@Named("piano") Instrument instrument) {
        this.instrument = instrument;
    }

    @Value("newSong")
    private String song;
    private Instrument instrument;
}
