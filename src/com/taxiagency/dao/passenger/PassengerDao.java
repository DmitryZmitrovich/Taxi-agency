package com.taxiagency.dao.passenger;

import com.taxiagency.dao.Dao;
import com.taxiagency.domain.Passenger;

import java.util.List;

public interface PassengerDao extends Dao<Passenger> {
    List<Passenger> findbyName(String name);

    List<Passenger> findbyPhoneRegexp(String name);


}