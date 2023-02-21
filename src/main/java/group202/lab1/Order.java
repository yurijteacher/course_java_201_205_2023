package group202.lab1;

import java.util.Date;

public class Order {

    private int id;
    private Date dateCreated;

    private boolean status;

    private Client client;

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Order() {
    }

    public Order(int id, Date dateCreated, boolean status) {
        this.id = id;
        this.dateCreated = dateCreated;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", dateCreated=" + dateCreated +
                ", status=" + status +
                ", client=" + client +
                '}';
    }
}
