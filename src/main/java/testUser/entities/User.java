package testUser.entities;

/**
 * Created by dzbe1116 on 4/19/2017.
 */
public class User {
    private String name;
    private String password;
    private int role;

    public User(String name, String password, int role) {
        this.name = name;
        this.password = password;
        this.role = role;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getRole() {
        return role;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", role=" + role +
                '}';
    }

    public void setRole(int role) {
        this.role = role;
    }
}