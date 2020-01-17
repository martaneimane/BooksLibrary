package test;

import hibernate.services.AuthorsService;
import org.junit.Test;
import static org.junit.Assert.*;

public class AuthorsServiceTest {

    private AuthorsService authorsService = new AuthorsService();

    @Test
    public void getAllAuthors(){
        System.out.println(authorsService.getAllAuthors());


    }

}
