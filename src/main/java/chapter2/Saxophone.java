package chapter2;


//import java.util.function.Predicate;

import org.springframework.stereotype.Component;

/**
 * Created by dzbe1116 on 4/10/2017.
 */
@Component
public class Saxophone implements Instrument {
    public Saxophone() {
    }

    @Override

    public void play() {
        System.out.println("TOOT TOOT TOOT");
 //       test( ((Predicate<String>) s ->  true).negate());
    }

//    private void test(Predicate<String> stringPredicate) {
//
//    }
}
