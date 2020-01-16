package hibernate.services;

import hibernate.entities.AuthorsEntity;
import hibernate.entities.BooksEntity;
import hibernate.util.HibernateUtility;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class AuthorsService {

    private Session session;

    public void createAuthor(AuthorsEntity authorsEntity) {

        session = HibernateUtility.getSessionFactory().openSession();

        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();
            session.save(authorsEntity);
            transaction.commit();
        } catch (Exception e) {
            transaction.rollback();
            e.printStackTrace();
        }
    }

    public void editAuthor(AuthorsEntity authorsEntity) {

        session = HibernateUtility.getSessionFactory().openSession();

        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();
            session.update(authorsEntity);
            transaction.commit();
        } catch (Exception e) {
            transaction.rollback();
            e.printStackTrace();
        }
    }

    public void deleteAuthor(AuthorsEntity authorsEntity) {

        session = HibernateUtility.getSessionFactory().openSession();

        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();
            session.delete(authorsEntity);
            transaction.commit();
        } catch (Exception e) {
            transaction.rollback();
            e.printStackTrace();
        }
    }

    public static List<AuthorsEntity> getAllAuthors() {
        Session session = HibernateUtility.getSessionFactory().openSession();
        List<AuthorsEntity> authorsEntityList = null;
        try {
            authorsEntityList = session.createQuery("from AuthorsEntity", AuthorsEntity.class).list();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return authorsEntityList;
    }




}
