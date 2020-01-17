package hibernate.services;

import hibernate.entities.BooksEntity;
import hibernate.util.HibernateUtility;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import org.hibernate.Session;
import org.hibernate.Transaction;

import javax.persistence.Query;
import java.util.List;

public class BooksService {
    private Session session;

    public BooksService() {
        session = HibernateUtility.getSessionFactory().openSession();
    }

    public void createBook(BooksEntity booksEntity) {

        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();
            session.save(booksEntity);
            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
            transaction.rollback();
        } finally {
            HibernateUtility.closeConnection();
        }
    }

    public void editBook(BooksEntity booksEntity) {

        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();
            session.update(booksEntity);
            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
            transaction.rollback();
        } finally {
            HibernateUtility.closeConnection();
        }
    }

    public void deleteBook(BooksEntity booksEntity) {
        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();
            session.delete(booksEntity);
            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
            transaction.rollback();
        } finally {
            HibernateUtility.closeConnection();
        }
    }

    public List<BooksEntity> getAllBooks() {
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
