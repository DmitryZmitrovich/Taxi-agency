package com.taxiagency.dao.driver;

import com.taxiagency.dao.RamDao;
import com.taxiagency.domain.Driver;

import java.util.ArrayList;
import java.util.List;

public class DriverRamDao extends RamDao<Driver> implements DriverDao {
    private List<Driver> data = new ArrayList<>();


    @Override
    public List<Driver> findByName(String name) {
        List<Driver> result = new ArrayList<>();

        for (Driver driver : data) {
            if (driver.getName().equals(name)) {
                result.add(driver);
            }
        }
        return result;
    }
}

