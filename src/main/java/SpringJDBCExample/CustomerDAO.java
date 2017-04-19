package SpringJDBCExample;

/**
 * Created by dzbe1116 on 4/19/2017.
 */
import SpringJDBCExample.Customer;

public interface CustomerDAO
{
    void insert(Customer customer);
    Customer findByCustomerId(int custId);
}
