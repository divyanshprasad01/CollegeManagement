/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.collegemanagement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.jar.Attributes.Name;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CollegeDatabase {
    
    String url = "jdbc:mysql://localhost:3306/testschema";
    String userName = "root";
    String password = "root";
    

    public CollegeDatabase() {
        try {
            Connection connection = DriverManager.getConnection(url,userName,password);
            
            Statement statement = connection.createStatement();
            ResultSet result = statement.executeQuery("select * from students;");
           result.next();
            System.out.println(result);
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    } 
    
}
