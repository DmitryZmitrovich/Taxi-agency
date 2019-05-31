package com.taxiagency.dao;

import com.taxiagency.domain.Entity;

import java.util.List;

public class RamDao<T extends Entity> implements Dao<T> {
    @Override
    public String save(T obj) {
        return null;
    }

    @Override
    public void update(T obj) {

    }

    @Override
    public String upsert(T obj) {
        return null;
    }

    @Override
    public void delete(T obj) {

    }

    @Override
    public T findById(String id) {
        return null;
    }

    @Override
    public List<T> findAll() {
        return null;
    }
}
