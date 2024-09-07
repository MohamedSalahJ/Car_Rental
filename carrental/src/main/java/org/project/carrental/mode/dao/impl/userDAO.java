package org.project.carrental.mode.dao.impl;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.project.carrental.config.DBConnection;
import org.project.carrental.entity.User;
import org.project.carrental.entity.UserRole;
import org.project.carrental.mode.dao.GenericDAO;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class userDAO implements GenericDAO<User> {
    private final static Logger logger= LogManager.getLogger();
    private static final String DELETE_USER_BYID = "DELETE from user_table where user_id=?";
    private  Connection con=new DBConnection().getConnetion();
    private static final String INSERT_USER="INSERT INTO user_table" +
         " (user_name,user_email,user_password,user_address,user_blocked,user_role)" +
         "VALUES(?,?,?,?,?,?)";
    private static final String UPDATE_USER="update user_table set user_name=? where user_id=?";
    private static final String sql = "Select * from user_table ";
    @Override
    public int insertItem(User item) {
        try {
            PreparedStatement PreparedStatement = con.prepareStatement(INSERT_USER);
            PreparedStatement.setString(1,item.getUserName());
            PreparedStatement.setString(2, item.getUserEmail());
            PreparedStatement.setString(3,item.getUserPassword());
            PreparedStatement.setString(4, item.getUserAddress());
            PreparedStatement.setBoolean(5,item.isUserBlocked());
            PreparedStatement.setString(6,item.getUserRole().name());
           return PreparedStatement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public List<User> getAllItems() {

        List<User> users=new ArrayList<>();

        try {

            PreparedStatement st=con.prepareStatement(sql);
            ResultSet set=st.executeQuery();
            while (set.next()){
                User user = getUser(set);

                users.add(user);
            }
        } catch (SQLException e) {
            logger.error("invalid sql");

        }
        return users;
    }


    @Override
    public User getItem(long id) {
        User user=null;
        try {
            PreparedStatement st=con.prepareStatement("Select * from user_table where user_id = ? ");
            st.setLong(1,id);

            ResultSet set=st.executeQuery();
            while(set.next()){
                user=getUser(set);
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return user;
    }

    @Override
    public int updateItem(User item) {
        try {
            PreparedStatement PreparedStatement = con.prepareStatement(UPDATE_USER);
            PreparedStatement.setString(1,item.getUserName());
            PreparedStatement.setLong(2,item.getId());

            return PreparedStatement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public int deleteItem(long id) {

        try {
            PreparedStatement  st = con.prepareStatement(DELETE_USER_BYID);
            st.setLong(1,id);
         return st.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


    }


    private static User getUser(ResultSet set) throws SQLException {
        long id= set.getLong("user_id");
        String userName= set.getString("user_name");
        String userEmail= set.getString("user_email");
        String userPassword= set.getString("user_password");
        String userAddress= set.getString("user_address");
        boolean userBlocked= set.getBoolean("user_blocked");
        UserRole userRole=UserRole.valueOf(set.getString("user_role"));
        return new User(id,userName,userEmail,userPassword,userAddress,userBlocked,userRole);

    }
}
