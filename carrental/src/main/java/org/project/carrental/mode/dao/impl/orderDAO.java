package org.project.carrental.mode.dao.impl;

import org.project.carrental.entity.Order;
import org.project.carrental.mode.dao.GenericDAO;

import java.util.List;

public class orderDAO implements GenericDAO<Order> {
    @Override
    public int insertItem(Order item) {
        return 0;
    }

    @Override
    public List<Order> getAllItems() {
        return null;
    }

    @Override
    public Order getItem(long id) {
        return null;
    }

    @Override
    public int updateItem(Order item) {
        return 0;
    }

    @Override
    public int deleteItem(long id) {
        return 0;
    }
}
