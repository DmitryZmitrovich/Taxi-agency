package com.taxiagency.dao.driver;

import com.taxiagency.dao.Dao;
import com.taxiagency.domain.Driver;

import java.util.List;

public interface DriverDao extends Dao<Driver> {
    List<Driver> findByName(String name);

}
