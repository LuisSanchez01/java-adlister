import java.util.List;

public interface Authors {
    List<Author> all();

    Author getAuthorById(long id);

    long insert(Author author);

    Author getAuthorById(int author_id);
}