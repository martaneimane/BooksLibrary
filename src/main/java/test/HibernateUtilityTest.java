package test;

import hibernate.util.HibernateUtility;
import org.hibernate.SessionFactory;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class HibernateUtilityTest {

    private HibernateUtility hibernateUtility = new HibernateUtility();

    @Test
    public void getSessionFactory(){
        SessionFactory sessionFactory = HibernateUtility.getSessionFactory();
        assertNotNull(sessionFactory);

    }



}
