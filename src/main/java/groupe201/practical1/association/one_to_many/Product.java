package groupe201.practical1.association.one_to_many;

public class Product {

    private int id;
    private String name;
    private String desc;
    private double price;
    private Category category;

    public Product() {
    }

    public Product(int id, String name, String desc, double price, Category category) {
        this.id = id;
        this.name = name;
        this.desc = desc;
        this.price = price;
        this.category = category;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                ", price=" + price +
                ", category=" + category +
                '}';
    }
}
