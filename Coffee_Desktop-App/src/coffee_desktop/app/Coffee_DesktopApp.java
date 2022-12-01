/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package coffee_desktop.app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Student.Admin
 */
public class Coffee_DesktopApp {
static final String DB_URL = "jdbc:mysql://localhost:3306/coffeedb";
    static final String USER = "root";
    static final String PASS = "";
    
    public static Connection connectionDB(){
        Connection Con = null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Con = (Connection) DriverManager.getConnection(DB_URL,USER,PASS);
            return Con;
        }catch (ClassNotFoundException | SQLException e){
            System.out.println("There were errors connecting to DB.");
            return null;
        }

    }
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
