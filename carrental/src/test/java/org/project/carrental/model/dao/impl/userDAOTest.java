package org.project.carrental.model.dao.impl;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.project.carrental.config.DBTestConnection;
import org.project.carrental.entity.User;

import java.sql.Connection;
import java.util.List;

import static org.junit.Assert.*;
public class userDAOTest {
    DBTestConnection testConfig=new DBTestConnection();
    private userDAO userDAO;
    private Connection connection;


    @Before
    public void setUp() throws Exception {
        connection=testConfig.getConnetion();
        userDAO=new userDAO(connection);

    }

    @After
    public void tearDown() throws Exception {
        connection=null;
        userDAO=null;

    }

    @Test
    public void insertItem() {
    }

    @Test
    public void getAllItems() {
        List<User> users=userDAO.getAllItems();
        int actualUsersSize=users.size();
        int expectedUserSize=100;
        assertEquals(expectedUserSize,actualUsersSize);
    }

    @Test
    public void getItem() {
    }

    @Test
    public void updateItem() {
    }

    @Test
    public void deleteItem() {
    }
}