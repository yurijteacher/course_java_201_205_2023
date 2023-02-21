package groupe205.lab1;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {

    // psvm + Enter

    public static void main(String[] args) {

        Genre genre = new Genre();
        genre.setId(1L);
        genre.setName("novel");
        genre.setDescription("aasd sad sad sa");

        Genre genre1 = new Genre(2L, "detective","dsad sad sad sad");
        genre1.setDescription("sad asd asd");

        List<Genre> genreList = new ArrayList<>();
        genreList.add(genre);
        genreList.add(genre1);

        for (Genre el : genreList
             ) {
            System.out.println(el);
        }

        Publisher publisher = new Publisher(1L,"New Publisher","dsf sdf sdf","sad asd asd");

        System.out.println(publisher);

        Author author = new Author();
        author.setId(1L);
        author.setFirstName("Vasya");
        author.setLastName("Pypkin");
        author.setYearOfBirth(new Date());
        author.setDescription("sad asd sad sad");

        System.out.println(author);

        Book book = new Book();
        book.setId(1L);
        book.setName("Book 1");
        book.setAuthor(author);
        book.setPublisher(publisher);
        book.setGenre(genreList.get(1));
        book.setDescription("asd asd sad sad sadsa");


        Book book1 = new Book(2L,"Book 2", author, genre1, publisher, "asd");

        List<Book> books = new ArrayList<>();
        books.add(book);
        books.add(book1);


        for (Book item : books) {
            System.out.println(item);
        }



        User user = new User();
        user.setId(1L);
        user.setUsername("Vasya");
        user.setPassword("1234");

        System.out.println(user);

        Client client = new Client();
        client.setId(1L);
        client.setUser(user);
        client.setFirstName("Vasya");
        client.setSecondName("Pypkin");
        client.setAge(23);
        client.setPhohe(51323);
        client.setEmail("1@ukr.net");

        System.out.println(client);

        Order order = new Order();
        order.setId(1);
        order.setClient(client);
        order.setDateCreated(new Date());
        order.setStatusOrderBook(false);

        System.out.println(order);

        BookHasOrder bookHasOrder = new BookHasOrder();
        bookHasOrder.setBook(book);
        bookHasOrder.setOrder(order);

        System.out.println(bookHasOrder);

    }


}
