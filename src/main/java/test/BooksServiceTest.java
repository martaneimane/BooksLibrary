package test;

import hibernate.entities.BooksEntity;
import hibernate.services.BooksService;
import org.junit.Test;


import static org.junit.Assert.*;

public class BooksServiceTest {

    private BooksService booksService = new BooksService();

    @Test
    public void createABook() {
        BooksEntity booksEntity = new BooksEntity();
        booksEntity.setAuthor("Test Author");
        booksEntity.setTitle("Test Title");
        booksEntity.setYear("1995");
        booksEntity.setCategory("Test Category");
        booksService.createBook(booksEntity);

        assertNotNull(booksEntity);
    }

    @Test
    public void editBook() {
        BooksEntity booksEntity = new BooksEntity();
        booksEntity.setAuthor("Test Author");
        booksEntity.setTitle("Test Title");
        booksEntity.setYear("1995");
        booksEntity.setCategory("Test Category");
        booksService.createBook(booksEntity);
        booksEntity.setTitle("Test Title 2");
        booksService.editBook(booksEntity);

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
