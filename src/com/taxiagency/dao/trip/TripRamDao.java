package com.taxiagency.dao.trip;

import com.taxiagency.domain.Trip;

import java.util.ArrayList;
import java.util.List;

public class TripRamDao implements TripDao {
    private List<Trip> data = new ArrayList<>();
    private Trip trip;

    @Override
    public List<Trip> findByCar(String car) {
        List<Trip> result = new ArrayList<>();

        for (Trip trip : data) {
            if (trip.getCar().equals(car)) {
                result.add(trip);
            }
        }
        return result;
    }


    @Override
    public List<Trip> findByPassenger(String passenger) {
        List<Trip> result = new ArrayList<>();

        for (Trip trip : data) {
            if (trip.getPassenger().equals(passenger)) {
                result.add(trip);
            }
        }
        return result;
    }

    @Override
    public String save(Trip obj) {
        data.add(obj);
        return obj.getId();
    }

    @Override
    public void update(Trip obj) {

    }

    @Override
    public String upsert(Trip obj) {
        return null;
    }

    @Override
    public void delete(Trip obj) {

    }

    @Override
    public Trip findById(String id) {
        for (Trip Trip : data) {
            if (trip.getId().equals(id)) {
                return trip;

            }


        }
        return null;
    }

    @Override
    public List<Trip> findAll() {
        return null;
    }
}

