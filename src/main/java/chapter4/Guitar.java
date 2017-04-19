package chapter4;

import org.springframework.stereotype.Component;

/**
 * Created by dzbe1116 on 4/14/2017.
 */
@Component
public class Guitar implements Instrument {
    @Override
    public String play() {
       return ("guitar sound");
    }
}
