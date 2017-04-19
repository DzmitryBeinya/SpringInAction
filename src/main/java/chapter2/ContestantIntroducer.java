package chapter2;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareParents;

/**
 * Created by dzbe1116 on 4/17/2017.
 */
@Aspect
public class ContestantIntroducer {

    @DeclareParents(
            value = "chapter2.Performer+",
            defaultImpl = GraciousContestant.class)
    public static Contestant contestant;
}
