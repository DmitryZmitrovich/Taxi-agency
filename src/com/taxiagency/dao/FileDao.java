package com.taxiagency.dao;

import com.taxiagency.domain.Entity;

import java.util.List;

public class FileDao<T extends Entity> implements Dao<T> {
    @Override
    public String save(Entity obj) {
        return null;
    }

    @Override
    public void update(Entity obj) {

    }

    @Override
    public String upsert(Entity obj) {
        return null;
    }

    @Override
    public void delete(Entity obj) {

    }

    @Override
    public T findById(String id) {
        return null;
    }

    @Override
    public List findAll() {
        return null;
    }
}
