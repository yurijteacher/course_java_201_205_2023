package groupe203.lab1;

public class ProductHasOrder {

    private Product product;
    private Order order;
    private int quantity;

    public ProductHasOrder() {}

    public ProductHasOrder(Product product, Order order, int quantity) {
        this.product = product;
        this.order = order;
        this.quantity = quantity;
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

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "ProductHasOrder{" +
                "product=" + product +
                ", order=" + order +
                ", quantity=" + quantity +
                '}';
    }
}
