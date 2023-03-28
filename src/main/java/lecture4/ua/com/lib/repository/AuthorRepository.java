package lecture4.ua.com.lib.repository;

import lecture4.ua.com.lib.dao.AuthorDao;
import lecture4.ua.com.lib.entity.Author;
import lecture4.ua.com.lib.entity.MapRowAuthor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class AuthorRepository implements AuthorDao {

    private JdbcTemplate jdbcTemplate;

    @Autowired
    @Qualifier("dataSource")
    public void setJdbcTemplate(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    @Override
    public void save(Author author) {
        jdbcTemplate.update("INSERT INTO `author`(name) VALUE(?)", author.getName());
    }

    @Override
    public void update(Author author) {
        jdbcTemplate.update("UPDATE `author` SET name=? where id=" + author.getId(), author.getName());
    }

    @Override
    public void delete(Author author) {
        jdbcTemplate.update("DELETE FROM `author` where id=" + author.getId());
    }

    @Override
    public void deleteAll() {
        jdbcTemplate.update("DELETE FROM `author`");
    }

    @Override
    public List<Author> findAll() {

        String sql = "SELECT * FROM `author`";

        // v.1
    //        return jdbcTemplate.query(sql, (rs, rowNum) -> {
    //            Author author = new Author();
    //            author.setId(rs.getLong("id"));
    //            author.setName(rs.getString("name"));
    //            return author;
    //        });
            // v. 2
    // jdbcTemplate.query(sql,new MapRowAuthor());
        return jdbcTemplate.query(sql, new RowMapper<Author>() {
            @Override
            public Author mapRow(ResultSet rs, int rowNum) throws SQLException {

                Author author = new Author();
                author.setId(rs.getLong("id"));
                author.setName(rs.getString("name"));
                return author;

            }
        });
    }


    @Override
    public Author findByName(String name) {
        return jdbcTemplate.queryForObject("select * from `author` where name='" + name + "'",
                (rs, rowNum) -> {
                    Long id = rs.getLong("id");
                    String name1 = rs.getString("name");
                    return new Author(id, name1);

                });
    }
}
