package chapter2;

import org.springframework.stereotype.Component;

/**
 * Created by dzbe1116 on 4/10/2017.
 */
@Component
public class Piano implements Instrument {
    @Override
    public void play() {
        System.out.println("PLINK PLINK PLINK");
    }
}
