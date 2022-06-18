package com.ssau.db.dao.impl;

import com.ssau.db.dao.ManagerDao;
import com.ssau.db.model.Manager;

import javax.ejb.Stateless;
import javax.persistence.TypedQuery;
import java.util.List;


@Stateless
public class ManagerDaoImpl extends AbstractDaoImpl<Manager> implements ManagerDao {

    private static String SELECT_MANAGER = "select c from Manager c";

    @Override
    public List<Manager> getAll() {
        TypedQuery<Manager> getAllQuery = em.createQuery(SELECT_MANAGER, Manager.class);
        List<Manager> result = getAllQuery.getResultList();
        return result;
    }
}
