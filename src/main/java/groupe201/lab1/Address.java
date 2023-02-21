package groupe201.lab1;

public class Address {

    private Long id;
    private String country;
    private String city;
    private String street;
    private String building;

    private Client client;

    public Address(Long id, String country, String city, String street, String building, Client client) {
        this.id = id;
        this.country = country;
        this.city = city;
        this.street = street;
        this.building = building;
        this.client = client;
    }
    public Address() {
    }

    public Address(Long id, String country, String city, String street, String building) {
        this.id = id;
        this.country = country;
        this.city = city;
        this.street = street;
        this.building = building;
    }

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

    public String getBuilding() {
        return building;
    }

    public void setBuilding(String building) {
        this.building = building;
    }

    @Override
    public String toString() {
        return "Address{" +
                "id=" + id +
                ", country='" + country + '\'' +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", building='" + building + '\'' +
                '}';
    }
}
