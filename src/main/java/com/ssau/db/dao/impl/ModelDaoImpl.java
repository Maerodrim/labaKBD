package com.ssau.db.dao.impl;

import com.ssau.db.dao.ModelDao;
import com.ssau.db.model.Model;

import javax.ejb.Stateless;
import javax.persistence.TypedQuery;
import java.util.List;

@Stateless
public class ModelDaoImpl extends AbstractDaoImpl<Model> implements ModelDao {

    private static String SELECT_MODEL = "select distinct c from Model c left join fetch c.manager";

    @Override
    public List<Model> getAll() {
        TypedQuery<Model> getAllQuery = em.createQuery(SELECT_MODEL, Model.class);
        List<Model> result = getAllQuery.getResultList();
        return result;
    }
}
