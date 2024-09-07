package org.project.carrental;


import org.project.carrental.entity.User;
import org.project.carrental.entity.UserRole;
import org.project.carrental.mode.dao.impl.userDAO;

import java.util.List;

public class App 
{

    public static void main( String[] args )  {

        userDAO userDAO=new userDAO();
        System.out.println("======================== SELECT ALL ========================");
       List<User> users= userDAO.getAllItems();
        for(User user:users){
            System.out.println(user.getUserName());
        }
        System.out.println("======================== SELECT BY ID ========================");
        int id=100;
        User user=userDAO.getItem(100);
        System.out.println(user);
        System.out.println("======================== DELETE ========================");
        int result= userDAO.deleteItem(id);
        if(result==1) System.out.println("Deleted item no-"+id);
        else System.out.println("the item you want to delete not found");
        List<User> usersAfter= userDAO.getAllItems();
      usersAfter.forEach(System.out::println);
        System.out.println("======================== UPDATE ========================");

        User updateUser=new User();
        updateUser.setId(1);
        updateUser.setUserName("Mohamed");
        int updateCount=userDAO.updateItem(updateUser);
        User updatedUser=userDAO.getItem(1);
        System.out.println("UpdatedUser :"+updatedUser);
        System.out.println("Updated Status: "+updateCount);


        System.out.println("======================== INSERT ========================");
        User newUser=new User("Username","Email.com","1111","address",false, UserRole.ADMIN);
        System.out.println("Insert Status: "+userDAO.insertItem(newUser));






    }
}

