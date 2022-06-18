package com.ssau.db.dao.impl;


import com.ssau.db.dao.СarDealerDao;
import com.ssau.db.model.CarDealer;

import javax.ejb.Stateless;
import javax.persistence.TypedQuery;
import java.util.List;

@Stateless
public class CarDealerDaoImpl extends AbstractDaoImpl<CarDealer> implements СarDealerDao {
    private static String SELECT_CAR_DEALER = "select c from CarDealer c";

    @Override
    public List<CarDealer> getAll() {
        TypedQuery<CarDealer> getAllQuery = em.createQuery(SELECT_CAR_DEALER, CarDealer.class);
        List<CarDealer> result = getAllQuery.getResultList();
        return result;
    }

}
