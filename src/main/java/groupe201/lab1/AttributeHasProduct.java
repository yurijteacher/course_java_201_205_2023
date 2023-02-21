package groupe201.lab1;

public class AttributeHasProduct {

    private Long id;

    private Attribute attribute;

    private Product product;

    public AttributeHasProduct() {
    }

    public AttributeHasProduct(Long id, Attribute attribute, Product product) {
        this.id = id;
        this.attribute = attribute;
        this.product = product;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Attribute getAttribute() {
        return attribute;
    }

    public void setAttribute(Attribute attribute) {
        this.attribute = attribute;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}
