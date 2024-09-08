package org.project.carrental.model.dao.impl;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.project.carrental.config.DBTestConfig;
import org.project.carrental.config.DBTestConnection;
import org.project.carrental.entity.User;
import org.project.carrental.entity.UserRole;

import java.sql.Connection;
import java.util.List;

import static org.junit.Assert.*;
public class userDAOTest {
    private DBTestConfig testConfig = new DBTestConfig();
    private userDAO userDao;
    private Connection connection;

    /**
     * This method will run before each single test in the class
     *
     * @throws Exception
     */
    @Before
    public void setUp() throws Exception {
        connection = testConfig.getConnection();
        userDao = new userDAO(connection);
    }

    /**
     * This method will run after each single test in the class
     *
     * @throws Exception
     */
    @After
    public void tearDown() throws Exception {
        connection = null;
        userDao = null;
    }


    @Test
    public void insertItem() {
        User user=new User("Mohamed","user@gmail.com",
                "1111","cairo",false, UserRole.ADMIN);
       userDao.insertItem(user);
        List<User> users=userDao.getAllItems();
        int actualUsersSize=users.size();
        int expectedUserSize=101;
        assertEquals(expectedUserSize,actualUsersSize);
    }

    @Test
    public void getAllItems() {
        List<User> users=userDao.getAllItems();
        int actualUsersSize=users.size();
        int expectedUserSize=100;
        assertEquals(expectedUserSize,actualUsersSize);
    }

    @Test
    public void getItem() {
        User actualUser=userDao.getItem(1);
        User expectedUser=new User(1,"tfleote0","nambrois0@hao123.com", "pdoogood0","34904 Anhalt Drive", true, UserRole.USER);

        assertEquals(expectedUser,actualUser);

    }

    @Test
    public void updateItem() {
        User expectedUser=new User(1,"Mohamed","nambrois0@hao123.com", "pdoogood0","34904 Anhalt Drive", true, UserRole.USER);

        int actualUpdateStatus=userDao.updateItem(expectedUser);

        int expectedUpdateStatus=1;
        assertEquals(expectedUpdateStatus,actualUpdateStatus);
    }

    @Test
    public void deleteItem() {
        User user=new User("Mohamed","user@gmail.com",
                "1111","cairo",false, UserRole.ADMIN);
        userDao.insertItem(user);
        int actualDeleteStatus= userDao.deleteItem(101);
        int expectedDeleteStatus=1;
        assertEquals(expectedDeleteStatus,actualDeleteStatus);

    }
}
