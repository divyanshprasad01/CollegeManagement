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
import javax.swing.JTable;

public class CollegeDatabase {
    
    static String url = "jdbc:mysql://localhost:3306/collegemanagement";
    static String userName = "root";
    static String password = "root";
    static Statement statement;
    

    public  CollegeDatabase() {
        try {
            Connection connection = DriverManager.getConnection(url,userName,password);
            statement = connection.createStatement();    
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    } 
    
    
    public static boolean insertData(String name, String admission, String enrol, String username, 
                                        String password, String dob, String course, String section, String email){
        
        String query = "INSERT INTO studentauthprof values(\""+ admission + "\",\"" +name+ "\",\"" + enrol + "\",\"" + dob + "\",\"" + username + "\",\"" + password + "\",\"" + course + "\",\"" + section + "\",\"\",\""+ email +"\");";
        
        try{
            return statement.execute(query);
            
        }catch(Exception e){
            return false;
        }
         
    }
    
    
    
    
    public static boolean fetchData(JTable table){
        return true;
    }
    
}
