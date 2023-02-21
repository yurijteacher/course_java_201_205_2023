package groupe205.lab1;

import java.util.Date;

public class Order {

    private int id;

    private Date dateCreated;

    private boolean statusOrderBook;

    private Client client;

    public Order() {
    }

    public Order(int id, Date dateCreated, boolean statusOrderBook, Client client) {
        this.id = id;
        this.dateCreated = dateCreated;
        this.statusOrderBook = statusOrderBook;
        this.client = client;
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

    public boolean isStatusOrderBook() {
        return statusOrderBook;
    }

    public void setStatusOrderBook(boolean statusOrderBook) {
        this.statusOrderBook = statusOrderBook;
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
                ", statusOrderBook=" + statusOrderBook +
                ", client=" + client +
                '}';
    }
}
