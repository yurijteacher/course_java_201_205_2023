package group202.practical1.association.one_to_one;

public class Main {

    public static void main(String[] args) {

        User user;
        user = new User();
        user.setId(1L);
        user.setUsername("Va");
        user.setPassword("1234");


        Client client = new Client();
        client.setId(user.getId());
        client.setFirstName("Vasya");
        client.setLastName("Pypkin");
        client.setAge(13);
        client.setEmail("Va@ukr.net");
        client.setPhone("51323");
        client.setUser(user);

        System.out.println(client);

    }
}
