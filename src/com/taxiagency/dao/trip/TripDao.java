package com.taxiagency.dao.trip;

import com.taxiagency.dao.Dao;
import com.taxiagency.domain.Trip;

import java.util.List;

public interface TripDao extends Dao<Trip> {
    List<Trip> findByCar(String car);
    List<Trip> findByPassenger(String passenger);
}
