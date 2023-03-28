package lecture2.patterns.structural_patterns.dao;

public class Product {

    private Long id;
    private String name;
    private String desc;
    private String image;
    private double price;

    public Product() {
    }

    public Product(Long id, String name, String desc, String image, double price) {
        this.id = id;
        this.name = name;
        this.desc = desc;
        this.image = image;
        this.price = price;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                ", image='" + image + '\'' +
                ", price=" + price +
                '}';
    }
}
