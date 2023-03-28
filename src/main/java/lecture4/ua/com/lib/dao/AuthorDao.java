package lecture4.ua.com.lib.dao;

import lecture4.ua.com.lib.entity.Author;

import java.util.List;

public interface AuthorDao {

    void save(Author author);
    void update(Author author);
    void delete(Author author);
    void deleteAll();
    List<Author> findAll();
    Author findByName(String name);

}
