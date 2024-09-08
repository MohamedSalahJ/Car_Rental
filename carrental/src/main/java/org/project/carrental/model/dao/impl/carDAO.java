package org.project.carrental.model.dao.impl;

import org.project.carrental.entity.Car;
import org.project.carrental.model.dao.GenericDAO;

import java.util.List;

public class carDAO implements GenericDAO<Car> {
    @Override
    public int insertItem(Car item) {
        return 0;
    }

    @Override
    public List<Car> getAllItems() {
        return null;
    }

    @Override
    public Car getItem(long id) {
        return null;
    }

    @Override
    public int updateItem(Car item) {
        return 0;
    }

    @Override
    public int deleteItem(long id) {
        return 0;
    }
}
