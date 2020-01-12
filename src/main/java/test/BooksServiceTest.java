package test;

import hibernate.entities.BooksEntity;
import hibernate.services.BooksService;
import org.junit.Test;
import static org.junit.Assert.*;

public class BooksServiceTest {

    private BooksService booksService = new BooksService();

    @Test
    public void createABook(){
        BooksEntity book = new BooksEntity("Title Example", "Author Example", "1995", "Drama");
        booksService.createBook(book);
        assertEquals();
    }
}
