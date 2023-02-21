package groupe201.lab1;

public class ProductsHasOrder {

    private Long id;
    private Order order;
    private Product product;

    public ProductsHasOrder() {

    }

    public ProductsHasOrder(Long id, Order order, Product product) {
        this.id = id;
        this.order = order;
        this.product = product;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    @Override
    public String toString() {
        return "ProductsHasOrder{" +
                "id=" + id +
                ", order=" + order +
                ", product=" + product +
                '}';
    }
}
