package lecture4.ua.com.lib.main;

import lecture4.ua.com.lib.entity.Author;
import lecture4.ua.com.lib.repository.AuthorRepository;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");

        AuthorRepository authorRepository = (AuthorRepository) context.getBean("authorRepository");

        Author author = new Author();
        author.setName("Ivanna");

        authorRepository.save(author);

        List<Author> authors = authorRepository.findAll();

        for (Author line : authors
             ) {
            System.out.println(line);
        }

        Author author1 = authorRepository.findByName("Ivanna");

        System.out.println(author1);

    }
}
