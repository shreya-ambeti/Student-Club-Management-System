/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package student.club.management.system;

/**
 *
 * @author Shreya Ambeti
 */
import java.sql.*;

public class Conn {
    
    Connection c;
    Statement s;

    public Conn () {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql:///clubmanagementsystem", "root", "Shreya0203");
            s = c.createStatement();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
