package com.taxiagency.dao.car;

import com.taxiagency.dao.Dao;
import com.taxiagency.domain.Car;

import java.util.List;

public interface CarDao extends Dao<Car> {
    List<Car> findbyColor(String color);
    List<Car>findbyNumber(int number);

}
