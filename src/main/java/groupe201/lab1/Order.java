package groupe201.lab1;

import java.util.Date;

public class Order {

    private Long id;
    private Date dateCreated;
    private Boolean statusOrder;

    private Client client;

    public Order(Long id, Date dateCreated, Boolean statusOrder, Client client) {
        this.id = id;
        this.dateCreated = dateCreated;
        this.statusOrder = statusOrder;
        this.client = client;
    }

    public Order() {
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

    public Boolean getStatusOrder() {
        return statusOrder;
    }

    public void setStatusOrder(Boolean statusOrder) {
        this.statusOrder = statusOrder;
    }

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
                ", statusOrder=" + statusOrder +
                ", client=" + client +
                '}';
    }
}
