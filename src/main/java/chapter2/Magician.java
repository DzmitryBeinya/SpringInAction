package chapter2;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

/**
 * Created by dzbe1116 on 4/13/2017.
 */
@Aspect
public class Magician implements MindReader {

    private String thoughts;

    @Pointcut("execution(* chapter2."
            + "Thinker.thinkOfSomething(String)) && args(thoughts)")
    public void thinking(String thoughts) {
    }

    @Before("thinking(thoughts)")
    public void interceptThoughts(String thoughts) {
        System.out.println("Intercepting volunteer’s thoughts");
        this.thoughts = thoughts;
    }

    @Override
    public String getThoughts() {
        return thoughts;
    }
}
