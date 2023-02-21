package groupe205.lab1;

import java.util.Date;

public class BookHasOrder {

    private Order order;
    private Book book;
    private Date openOrder;
    private Date closeOrder;

    public BookHasOrder() {
    }

    public BookHasOrder(Order order, Book book, Date openOrder, Date closeOrder) {
        this.order = order;
        this.book = book;
        this.openOrder = openOrder;
        this.closeOrder = closeOrder;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public Date getOpenOrder() {
        return openOrder;
    }

    public void setOpenOrder(Date openOrder) {
        this.openOrder = openOrder;
    }

    public Date getCloseOrder() {
        return closeOrder;
    }

    public void setCloseOrder(Date closeOrder) {
        this.closeOrder = closeOrder;
    }

    @Override
    public String toString() {
        return "BookHasOrder{" +
                "order=" + order +
                ", book=" + book +
                ", openOrder=" + openOrder +
                ", closeOrder=" + closeOrder +
                '}';
    }
}
