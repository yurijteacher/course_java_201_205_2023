package groupe205;

public class Book {

    private Long id;
    private String name;
    private Author author;
    private Genre genre;
    private Publisher publisher;

    private String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Book() {
    }

    public Book(Long id, String name, Author author, Genre genre, Publisher publisher) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.genre = genre;
        this.publisher = publisher;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public Publisher getPublisher() {
        return publisher;
    }

    public void setPublisher(Publisher publisher) {
        this.publisher = publisher;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", author=" + author +
                ", genre=" + genre +
                ", publisher=" + publisher +
                '}';
    }

    public Book(Long id, String name, Author author, Genre genre, Publisher publisher, String description) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.genre = genre;
        this.publisher = publisher;
        this.description = description;
    }
}
