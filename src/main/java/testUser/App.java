package testUser;
import SpringJDBCExample.Customer;
import SpringJDBCExample.CustomerDAO;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import testUser.DAO.UserDAO;
import testUser.entities.User;

public class App
{
    public static void main( String[] args )
    {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("testUserResources/Spring-Module.xml");

        UserDAO userDAO = (UserDAO) context.getBean("userDAO");

        User user = userDAO.selectUserByName("Slava");
        System.out.println(user);

    }
}
