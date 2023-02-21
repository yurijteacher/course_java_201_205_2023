package groupe203.lab1;

import java.util.Date;

public class Order {
    private int id;
    private Date dateCreatedOrder;
    private boolean statusOrder;
    private String delivery;
    private String payment;
    private Client client;

    // Constructor
    public Order() {}

    // Constructor ALL PARAM
    public Order(int id, Date dateCreatedOrder, boolean statusOrder, String delivery, String payment, Client client) {
        this.id = id;
        this.dateCreatedOrder = dateCreatedOrder;
        this.statusOrder = statusOrder;
        this.delivery = delivery;
        this.payment = payment;
        this.client = client;
    }

    // GET/SET
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDateCreatedOrder() {
        return dateCreatedOrder;
    }

    public void setDateCreatedOrder(Date dateCreatedOrder) {
        this.dateCreatedOrder = dateCreatedOrder;
    }

    public boolean isStatusOrder() {
        return statusOrder;
    }

    public void setStatusOrder(boolean statusOrder) {
        this.statusOrder = statusOrder;
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

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    // TOSTRING
    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", dateCreatedOrder=" + dateCreatedOrder +
                ", statusOrder=" + statusOrder +
                ", delivery='" + delivery + '\'' +
                ", payment='" + payment + '\'' +
                ", client=" + client +
                '}';
    }
}
