package chapter2;

/**
 * Created by dzbe1116 on 4/10/2017.
 */
public class Juggler implements Performer{

    private int beanBags = 3;

    @Override
    public void perform() {
        System.out.println("JUGGLING " + beanBags + " BEANBAGS");
    }

    public Juggler() {
    }

    public Juggler(int beanBags) {
        this.beanBags = beanBags;
    }
}
