package testUser.DAO;

import testUser.entities.User;

/**
 * Created by dzbe1116 on 4/19/2017.
 */
public interface UserDAO {
    User selectUserByName(String name);
}
