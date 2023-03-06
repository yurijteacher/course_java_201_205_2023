package groupe201.practical1.association.one_to_one;

public class Main {

    public static void main(String[] args) {

        User user = new User(1L, "va", "123");

        // Client client = new Client(1L, "Vasyz", "Pypkin", user);

        Client client1 = new Client(user.getId(), "Vasyz", "Pypkin", user);

    }
}
