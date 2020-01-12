package hibernate.services;

import hibernate.entities.BooksEntity;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class BooksService {
    private Session session;

    public void createBook(BooksEntity booksEntity) {

        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();
            session.save(booksEntity);
            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
