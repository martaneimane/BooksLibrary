package test;

import hibernate.entities.AuthorsEntity;
import hibernate.entities.BooksEntity;
import hibernate.services.AuthorsService;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class AuthorsServiceTest {

    private AuthorsService authorsService = new AuthorsService();

    @Test
    public void createAuthor(){
        List authorList = authorsService.getAllAuthors();
        AuthorsEntity authorsEntity = new AuthorsEntity();
        authorsEntity.setAuthorNameSurname("Author Name");
        authorsEntity.setCountry("Latvia");
        authorsService.createAuthor(authorsEntity);
        List authorList2 = authorsService.getAllAuthors();

        assertEquals(authorList2.size(), authorList.size() + 1);
    }

    @Test
    public void getAllAuthors(){
        System.out.println(authorsService.getAllAuthors());


    }

}
