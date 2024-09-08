package org.project.carrental.model.dao;

import java.util.List;

public interface GenericDAO<T> {

    //create item
    public int insertItem(T item);

    //Read
    public List<T> getAllItems();

    public T getItem(long id);

    //update
    public int updateItem(T item);

    //Delete
    public int deleteItem(long id);



}
