package org.project.carrental.mode.dao.impl;

import org.project.carrental.entity.User;
import org.project.carrental.mode.dao.GenericDAO;

import java.util.List;

public class userDAO implements GenericDAO<User> {


    @Override
    public int insertItem(User item) {
        return 0;
    }

    @Override
    public List<User> getAllItems() {
        return null;
    }

    @Override
    public User getItem(long id) {
        return null;
    }

    @Override
    public int updateItem(User item) {
        return 0;
    }

    @Override
    public int deleteItem(long id) {
        return 0;
    }
}
