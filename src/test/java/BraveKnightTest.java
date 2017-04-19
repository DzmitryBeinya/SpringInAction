import chapter1.BraveKnight;
import chapter1.Quest;
import chapter2.Magician;
import chapter2.Thinker;
import org.junit.Test;
import static org.mockito.Mockito.*;
import chapter2.Volunteer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static junit.framework.Assert.*;
/**
 * Created by dzbe1116 on 4/7/2017.
 */
public class BraveKnightTest {
    @Test
    public void magicianShouldReadMind() {
        ApplicationContext context = new ClassPathXmlApplicationContext(
                "spring-idol.xml");

        Magician magician = (Magician) context.getBean("magician");
        Thinker volunteer = (Thinker) context.getBean("volunteer");
        volunteer.thinkOfSomething("Queen of Hearts");
        System.out.println(magician);
        System.out.println(volunteer);
        assertEquals("Queen of Hearts", magician.getThoughts());

    }

}
