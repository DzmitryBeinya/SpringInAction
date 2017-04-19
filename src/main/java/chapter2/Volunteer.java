package chapter2;

/**
 * Created by dzbe1116 on 4/17/2017.
 */
public class Volunteer implements Thinker {

    private String thoughts;

    @Override
    public void thinkOfSomething(String thoughts) {
        this.thoughts = thoughts;
    }

    public String getThoughts() {
        return thoughts;
    }
}
