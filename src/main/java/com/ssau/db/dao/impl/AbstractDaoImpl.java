package com.ssau.db.dao.impl;

import com.ssau.db.dao.Dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public abstract class AbstractDaoImpl<T> implements Dao<T> {
    private T t;
    @PersistenceContext(unitName = "default")
    protected EntityManager em;

    public T get(Integer id) {
        return (T) em.find(t.getClass(), id);
    }

    public void save(T object) {
        em.persist(object);

    }

    public void update(T object) {
        em.merge(object);
    }

    public void delete(T object) {
        em.remove(em.contains(object) ? object : em.merge(object));
    }
}
