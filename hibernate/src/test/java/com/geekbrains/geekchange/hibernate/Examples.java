package com.geekbrains.geekchange.hibernate;

import org.hibernate.LazyInitializationException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.junit.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

import static org.junit.Assert.*;

public class Examples {

    private static SessionFactory sessionFactory;
    private Session session;
    private static final Logger log = LoggerFactory.getLogger(Examples.class);

    @BeforeClass
    public static void createSessionFactory() {
        sessionFactory = new Configuration()
                .addAnnotatedClass(Item.class)
                .addAnnotatedClass(User.class)
                .addAnnotatedClass(UserDetails.class)
                .addAnnotatedClass(Student.class)
                .addAnnotatedClass(University.class)
                .addAnnotatedClass(Book.class)
                .addAnnotatedClass(Reader.class)
                .buildSessionFactory();
    }

    @AfterClass
    public static void closeSessionFactory() {
        sessionFactory.close();
    }

    @Test
    public void create() {
        session = sessionFactory.getCurrentSession();
        session.beginTransaction();
        Item item = new Item("Bread", 55);
        log.info("item before save: {}", item);
        session.save(item);
        log.info("item after save: {}", item);
        session.getTransaction().commit();

        assertNotNull(item.getId());
    }

    @Test
    public void read() {
        Session session = sessionFactory.getCurrentSession();
        session.beginTransaction();
        Item item = session.get(Item.class, 3L);
        log.info("item : {}", item);
        session.getTransaction().commit();

        assertNotNull(item);
    }

    @Test
    public void hqlRead() {
        Long itemId = 3L;

        session = sessionFactory.getCurrentSession();
        session.beginTransaction();
        Item item = session.createQuery("select i from Item i WHERE i.id = :id", Item.class)
                .setParameter("id", itemId).uniqueResult();
        log.info("item : {}", item);
        session.getTransaction().commit();

        assertNotNull(item);
        assertEquals(itemId, item.getId());
    }

    @Test
    public void hqlMoreOneRead() {
        session = sessionFactory.getCurrentSession();
        session.beginTransaction();
        List<Item> items = session.createQuery("select i from Item i", Item.class).getResultList();
        log.info("items : {}", items);
        session.getTransaction().commit();

        assertTrue(items.size() > 0);
    }

    @Test
    public void update() {
        session = sessionFactory.getCurrentSession();
        session.beginTransaction();
        Item item = session.get(Item.class, 4L);
        log.info("item : {}", item);
        item.setPrice(199);
        session.getTransaction().commit();
    }

    @Test
    public void delete() {
        session = sessionFactory.getCurrentSession();
        session.beginTransaction();
        Item item = session.get(Item.class, 2L);
        log.info("item : {}", item);
        session.remove(item);
        session.getTransaction().commit();
    }

    @Test
    public void oneToOne() {
        session = sessionFactory.getCurrentSession();
        session.beginTransaction();

        User user = session.get(User.class, 1L);
        log.info("user : {}", user);

        session.getTransaction().commit();

        assertNotNull(user.getDetails());
    }

    @Test
    public void oneToMany() {
        session = sessionFactory.getCurrentSession();
        session.beginTransaction();
        University university = session.get(University.class, 1L);
        log.info("university: {}", university);
        session.getTransaction().commit();

        assertNotNull(university);
        assertFalse(university.getStudents().isEmpty());
    }

    @Test
    public void manyToMany() {
        session = sessionFactory.getCurrentSession();
        session.beginTransaction();
        Reader reader = session.get(Reader.class, 1L);
        reader.getBooks().size();
        log.info("reader: {}", reader);
        session.getTransaction().commit();

        assertFalse(reader.getBooks().isEmpty());
    }

    @Test(expected = LazyInitializationException.class)
    public void manyToMany_lazyInitializationException() {
        session = sessionFactory.getCurrentSession();
        session.beginTransaction();
        Reader reader = session.get(Reader.class, 1L);
        log.info("reader: {}", reader);
        session.getTransaction().commit();

        //попробовать достать книги, после того как транзакция уже закрыта
        reader.getBooks().isEmpty();
    }
}
