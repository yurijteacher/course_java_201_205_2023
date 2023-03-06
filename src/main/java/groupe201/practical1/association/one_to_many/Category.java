package groupe201.practical1.association.one_to_many;

import java.util.List;

public class Category {
    private int id;
    private String name;
    private String descr;
    private List<Product> products;

    public Category() {
    }

    public Category(int id, String name, String descr) {
        this.id = id;
        this.name = name;
        this.descr = descr;
    }

    @Override
    public String toString() {
        return "Category{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", descr='" + descr + '\'' +
                ", products=" + products +
                '}';
    }
}
