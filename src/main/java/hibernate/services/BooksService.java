package hibernate.services;

import hibernate.entities.BooksEntity;
import hibernate.util.HibernateUtility;
import javafx.collections.ObservableList;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class BooksService {
    private Session session;

    public void createBook(BooksEntity booksEntity) {

        session = HibernateUtility.getSessionFactory().openSession();

        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();
            session.save(booksEntity);
            transaction.commit();
        } catch (Exception e) {
            transaction.rollback();
            e.printStackTrace();
        }
    }

    public void editBook(BooksEntity booksEntity) {

        session = HibernateUtility.getSessionFactory().openSession();

        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();
            session.update(booksEntity);
            transaction.commit();
        } catch (Exception e) {
            transaction.rollback();
            e.printStackTrace();
        }
    }

    public void deleteBook(BooksEntity booksEntity) {

        session = HibernateUtility.getSessionFactory().openSession();

        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();
            session.delete(booksEntity);
            transaction.commit();
        } catch (Exception e) {
            transaction.rollback();
            e.printStackTrace();
        }
    }

    public static List<BooksEntity> getAllBooks() {
         Session session = HibernateUtility.getSessionFactory().openSession();
        List<BooksEntity> booksEntityList = null;
        try {
            booksEntityList = session.createQuery("from BooksEntity", BooksEntity.class).list();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return booksEntityList;
    }

}
