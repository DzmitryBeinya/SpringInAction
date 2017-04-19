package chapter2;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.inject.Inject;
import javax.inject.Named;

/**
 * Created by dzbe1116 on 4/10/2017.
 */


public class Instrumentalist implements Performer {
    public Instrumentalist() {
    }


    public Instrumentalist(Instrument instrument) {
        this.instrument = instrument;
    }

    public Instrumentalist(String song, Instrument instrument) {
        this.song = song;
        this.instrument = instrument;
    }

    @Override
    public void perform() {
        System.out.print("Playing " + song + " : ");
        instrument.play();
    }


    private String song;


    private Instrument instrument;


    public void setSong(String song) {
        this.song = song;
    }

    public void setInstrument(Instrument instrument) {
        this.instrument = instrument;
    }

}
