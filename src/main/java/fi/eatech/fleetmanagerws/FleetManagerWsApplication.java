package fi.eatech.fleetmanagerws;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


import java.sql.*;
import java.util.Arrays;


@SpringBootApplication
//@ComponentScan({"fi.eatech.fleetmanagerws", "fi.eatech.fleetmanagerws.controller"});
public class FleetManagerWsApplication {

	public static void main(String[] args) {
		SpringApplication.run(FleetManagerWsApplication.class, args);
		System.out.println("Hello world!");
                //Car.Test();
                
                
                
                
                /*
                try {
                    Class.forName("com.mysql.jdbc.Driver");  
                    Connection con=DriverManager.getConnection(
                            "jdbc:mysql://localhost:3306/test","Timo","alien123");  
                    //here sonoo is database name, root is username and password  
                    Statement stmt=con.createStatement();  
                    ResultSet rs=stmt.executeQuery("select * from pokemon");  
                    while(rs.next())  
                        System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));  
                    con.close();  
                }
                catch (Exception e) {
                    System.out.println(e);
                }*/
                
                System.out.println("Now I am here");
                
	}
}
