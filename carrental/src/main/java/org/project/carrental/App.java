package org.project.carrental;

import org.project.carrental.entity.Car;
import org.project.carrental.entity.User;
import org.project.carrental.entity.UserRole;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        User user1=new User(1,"mohamed","mohamed@luv2code.com",
                "1111","Egypt",false, UserRole.ADMIN);


        System.out.println(user1);



    }
}
