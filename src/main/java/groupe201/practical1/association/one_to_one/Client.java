package groupe201.practical1.association.one_to_one;

public class Client {
    private Long id;
    private String firstName;
    private String lastName;

    private User user;

    public Client() {
    }

    public Client(Long id, String firstName, String lastName, User user) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.user = user;
    }
}
