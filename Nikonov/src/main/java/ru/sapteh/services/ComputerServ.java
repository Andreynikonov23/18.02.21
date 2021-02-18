package ru.sapteh.services;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.NativeQuery;
import ru.sapteh.dao.DAO;
import ru.sapteh.model.Computer;

import javax.persistence.Query;
import java.util.List;

public class ComputerServ implements DAO<Computer, Integer> {
    private final SessionFactory factory;
    public ComputerServ (SessionFactory factory) {
        this.factory = factory;
    }

    @Override
    public void create(Computer computer) {
        try(Session session = factory.openSession()) {
            session.beginTransaction();
            session.save(computer);
            session.getTransaction().commit();
        }
    }
    @Override
    public void update(Computer computer) {
        try(Session session = factory.openSession()){
            session.beginTransaction();
            session.update(computer);
            session.getTransaction().commit();
        }
    }

    @Override
    public void delete(Computer computer) {
        try(Session session = factory.openSession()) {
            session.beginTransaction();
            session.delete(computer);
            session.getTransaction().commit();
        }
    }

    @Override
    public Computer findById(Integer id) {
        Session session = factory.openSession();
        return session.get(Computer.class, id);
    }

    @Override
    public List<Computer> findByAll() {
        try (Session session = factory.openSession()) {
            String sql = "SELECT * FROM comp";
            Query query = session.createNativeQuery(sql).addEntity(Computer.class);
            return query.getResultList();
        }
    }
}
