package com.taxiagency.dao.passenger;

import com.taxiagency.domain.Passenger;

import java.util.List;

public class PassengerFileDao implements PassengerDao{
    @Override
    public List<Passenger> findbyName(String name) {
        return null;
    }

    @Override
    public List<Passenger> findbyPhoneRegexp(String name) {
        return null;
    }

    @Override
    public String save(Passenger obj) {
        return null;
    }

    @Override
    public void update(Passenger obj) {

    }

    @Override
    public String upsert(Passenger obj) {
        return null;
    }

    @Override
    public void delete(Passenger obj) {

    }

    @Override
    public Passenger findById(String id) {
        return null;
    }

    @Override
    public List<Passenger> findAll() {
        return null;
    }
}
