package chapter1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by dzbe1116 on 4/7/2017.
 */
public class Application {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("knights.xml");
        Knight knight1 = (Knight) context.getBean("knight1");
        knight1.embarkOnQuest();

        Knight knight2 = (Knight) context.getBean("knight2");
        knight2.embarkOnQuest();

        TestAOP testAOP = (TestAOP) context.getBean("testAOP");
        testAOP.embark();
    }
}
