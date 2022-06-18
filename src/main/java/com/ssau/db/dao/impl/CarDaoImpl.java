package com.ssau.db.dao.impl;

import com.ssau.db.dao.CarDao;
import com.ssau.db.model.Car;

import javax.ejb.Stateless;
import javax.persistence.TypedQuery;
import java.util.List;

@Stateless
public class CarDaoImpl extends AbstractDaoImpl<Car> implements CarDao {

    private static String SELECT_CAR = "select c from Car c";

    @Override
    public List<Car> getAll() {
        TypedQuery<Car> getAllQuery = em.createQuery(SELECT_CAR, Car.class);
        List<Car> result = getAllQuery.getResultList();
        return result;
    }
}
