package com.taxiagency.dao.car;

import com.taxiagency.domain.Car;

import java.util.ArrayList;
import java.util.List;

public class CarRamDao implements CarDao {

    List<Car> result = new ArrayList<>();
    private Car[] data;
    private Car number;

    @Override
    public List<Car> findbyColor(String color) {
        for (Car car : data) {
            if (car.getColor().equals(color)) {
                result.add(car);
            }
        }
        return result;

    }

    public List<Car> findbyNumber(int number) {
        for (Car car : data) {
            if ((Boolean) car.toString().equals(number)) {
                result.add(car);
            }
            return result;
        }
        return null;
    }

    @Override
    public String save(Car obj) {
        return null;
    }

    @Override
    public void update(Car obj) {

    }

    @Override
    public String upsert(Car obj) {
        return null;
    }

    @Override
    public void delete(Car obj) {

    }

    @Override
    public Car findById(String id) {
        for (Car car : data) {
            if (car.getId().equals(id)) {
                return car;

            }
        }

return null;
    }

    @Override
    public List<Car> findAll() {
        return null;
    }
}
