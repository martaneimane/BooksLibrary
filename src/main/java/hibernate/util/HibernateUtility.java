package hibernate.util;


import hibernate.entities.AuthorsEntity;
import hibernate.entities.BooksEntity;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;

import java.util.Properties;

public class HibernateUtility {
    private static SessionFactory sessionFactory;

    public static SessionFactory getSessionFactory() {
        if (sessionFactory == null) {
            try {
                Configuration configuration = new Configuration();
                Properties settings = new Properties();
                settings.put(Environment.URL, "jdbc:mysql://127.0.0.1:3306/sda");
                settings.put(Environment.USER, "root");
                settings.put(Environment.PASS, "Xh010501!");
                settings.put(Environment.DIALECT, "org.hibernate.dialect.MySQLDialect");

                configuration.setProperties(settings);
                configuration.addAnnotatedClass(BooksEntity.class);
                configuration.addAnnotatedClass(AuthorsEntity.class);
                ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
                        .applySettings(configuration.getProperties())
                        .build();

                sessionFactory = configuration.buildSessionFactory(serviceRegistry);
            } catch (Exception e) {
                System.err.println(e);
            }


        }
        return sessionFactory;
    }

    public static void closeConnection() {
        getSessionFactory().close();
    }
}
