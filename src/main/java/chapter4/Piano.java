package chapter4;

import org.springframework.stereotype.Component;

/**
 * Created by dzbe1116 on 4/14/2017.
 */
@Component
public class Piano implements Instrument {
    @Override
    public String play() {
        return ("piano sound");
    }
}
