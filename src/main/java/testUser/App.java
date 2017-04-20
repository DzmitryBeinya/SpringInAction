package testUser;
import SpringJDBCExample.Customer;
import SpringJDBCExample.CustomerDAO;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import testUser.DAO.UserDAO;
import testUser.DAO.impl.StudentDao;
import testUser.entities.Student;
import testUser.entities.User;

public class App
{
    public static void main( String[] args )
    {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("testUserResources/Spring-Module.xml");

        StudentDao studentDao = (StudentDao) context.getBean("studentDao");

        for (int i = 1; i <= 10; i++) {
            Student student = studentDao.selectStudentByIdWithJDBCTemplate(i);
            System.out.println(student);
        }


    }
}
