package groupe204.lab1.shop;

public class ProductHasOrder {

    private Long id;
    private Product product;
    private Order order;

    public ProductHasOrder() {
    }

    public ProductHasOrder(Long id, Product product, Order order) {
        this.id = id;
        this.product = product;
        this.order = order;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }
}
