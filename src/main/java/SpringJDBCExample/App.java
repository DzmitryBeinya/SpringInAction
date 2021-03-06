package SpringJDBCExample;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class App
{
    public static void main( String[] args )
    {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("Spring-Module.xml");

        CustomerDAO customerDAO = (CustomerDAO) context.getBean("customerDAO");
        Customer customer = new Customer(5, "mkyong",28);
        customerDAO.insert(customer);

        Customer customer1 = customerDAO.findByCustomerId(5);
        System.out.println(customer1);

    }
}
