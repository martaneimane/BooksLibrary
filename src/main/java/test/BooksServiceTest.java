package test;

import hibernate.entities.BooksEntity;
import hibernate.services.BooksService;
import org.hibernate.Session;
import org.junit.Test;


import java.util.List;

import static org.junit.Assert.*;

public class BooksServiceTest {

    private BooksService booksService = new BooksService();
    private Session session;

    @Test
    public void createABook() {
        List bookList = booksService.getAllBooks();
        BooksEntity booksEntity = new BooksEntity();
        booksEntity.setAuthor("Test Author");
        booksEntity.setTitle("Test Title");
        booksEntity.setYear("1995");
        booksEntity.setCategory("Test Category");
        booksService.createBook(booksEntity);
        List booklist2 = booksService.getAllBooks();

        assertEquals(booklist2.size(), bookList.size() + 1);

    }

    @Test
    public void editBook() {
        BooksEntity booksEntity = new BooksEntity();
        String setAuthor = "Test Author";
        String editAuthor = "Test Author Edit";
        booksEntity.setAuthor(setAuthor);
        booksEntity.setTitle("Test Title");
        booksEntity.setYear("1995");
        booksEntity.setCategory("Test Category");
        booksService.createBook(booksEntity);
        booksEntity.setAuthor(editAuthor);
        booksService.editBook(booksEntity);

        assertNotEquals(editAuthor, setAuthor);

    }

    @Test
    public void deleteBook() {
        BooksEntity booksEntity = new BooksEntity();
        booksEntity.setAuthor("Test Author");
        booksEntity.setTitle("Test Title");
        booksEntity.setYear("2010");
        booksEntity.setCategory("Test Category");
        booksService.createBook(booksEntity);
        booksService.deleteBook(booksEntity);

    }

    @Test
    public void getAllBooks() {
        System.out.println(booksService.getAllBooks());

    }

}
