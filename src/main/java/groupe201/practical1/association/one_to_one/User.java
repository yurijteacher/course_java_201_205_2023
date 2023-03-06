package groupe201.practical1.association.one_to_one;

public class User {

    private Long id;
    private String user;
    private String pass;

    private Client client;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public User(Long id, String user, String pass, Client client) {
        this.id = id;
        this.user = user;
        this.pass = pass;
        this.client = client;
    }

    public User() {
    }
    public User(Long id, String user, String pass) {
        this.id = id;
        this.user = user;
        this.pass = pass;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", user='" + user + '\'' +
                ", pass='" + pass + '\'' +
                '}';
    }
}
