package groupe204.lab1.shop;

import java.util.Date;

public class Order {

    private Long id;
    private Date dateCreated;

    private String delivery;

    private String payment;

    private Boolean statusOrder;

    private Client client;

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", dateCreated=" + dateCreated +
                ", delivery='" + delivery + '\'' +
                ", payment='" + payment + '\'' +
                ", statusOrder=" + statusOrder +
                '}';
    }

    public Order() {
    }

    public Order(Long id, Date dateCreated, String delivery, String payment, Boolean statusOrder) {
        this.id = id;
        this.dateCreated = dateCreated;
        this.delivery = delivery;
        this.payment = payment;
        this.statusOrder = statusOrder;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public String getDelivery() {
        return delivery;
    }

    public void setDelivery(String delivery) {
        this.delivery = delivery;
    }

    public String getPayment() {
        return payment;
    }

    public void setPayment(String payment) {
        this.payment = payment;
    }

    public Boolean getStatusOrder() {
        return statusOrder;
    }

    public void setStatusOrder(Boolean statusOrder) {
        this.statusOrder = statusOrder;
    }
}
