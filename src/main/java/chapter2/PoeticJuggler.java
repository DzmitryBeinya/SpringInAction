package chapter2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import javax.inject.Inject;
import javax.inject.Named;

/**
 * Created by dzbe1116 on 4/10/2017.
 */

public class PoeticJuggler extends Juggler {

    private Poem poem;


    public PoeticJuggler(Poem poem) {
        super();
        this.poem = poem;
    }

    public PoeticJuggler(int beanBags, Poem poem) {
        super(beanBags);
        this.poem = poem;
    }

    @Override
    public void perform() {
        super.perform();
        System.out.println("While reciting...");
        poem.recite();
    }

    public void init() {
        System.out.println("init!!!");
    }

    public void destroy() {
        System.out.println("destroy!!!");
    }


}
