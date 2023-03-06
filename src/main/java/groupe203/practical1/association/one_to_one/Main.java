package groupe203.practical1.association.one_to_one;

public class Main {


    public static void main(String[] args) {

        User user = new User(1L, "V", "1234");
        Client client = new Client(user.getId(), "Vasya", "Pypkin", 23, "51323", user);
        System.out.println(client);

    }
}
