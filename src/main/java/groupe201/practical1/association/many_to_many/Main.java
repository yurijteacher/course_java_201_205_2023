package groupe201.practical1.association.many_to_many;

import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        Role role = new Role(1, "manager");
        Role role1 = new Role(2, "admin");

        User user = new User(1, "Vasya","asd");

        Set<Role> roleSet = new HashSet<>();
        roleSet.add(role);
        roleSet.add(role1);

        user.setRoles(roleSet);

        System.out.println(user);


    }
}
