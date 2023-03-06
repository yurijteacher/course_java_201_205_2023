package groupe203.practical1.association.one_to_many;

public class Address {

    private Long id;
    private String country;
    private String city;
    private String street;
    private String bul;

    public Address() {
    }

    public Address(Long id, String country, String city, String street, String bul) {
        this.id = id;
        this.country = country;
        this.city = city;
        this.street = street;
        this.bul = bul;
    }

    private Client client;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getBul() {
        return bul;
    }

    public void setBul(String bul) {
        this.bul = bul;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    @Override
    public String toString() {
        return "Address{" +
                "id=" + id +
                ", country='" + country + '\'' +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", bul='" + bul + '\'' +
                '}';
    }
}
