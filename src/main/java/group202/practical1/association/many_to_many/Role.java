package group202.practical1.association.many_to_many;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Role {

    private int id;
    private String name;

    private Set<User> users;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<User> getUsers() {
        return users;
    }

    public void setUsers(Set<User> users) {
        this.users = users;
    }

    @Override
    public String toString() {
        return "Role{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", users=" + users +
                '}';
    }

    public static void main(String[] args) {

        Role role1 = new Role();
        role1.setId(1);
        role1.setName("Admin");

        Role role2 = new Role();
        role1.setId(2);
        role1.setName("User");

        Role role3 = new Role();
        role1.setId(3);
        role1.setName("Manager");

        Set<Role> roleList = new HashSet<>();
        roleList.add(role1);
        roleList.add(role2);

        User user = new User();
        user.setUsername("Vasya");
        user.setRoles(roleList);
        user.setId(1);
    }
}
