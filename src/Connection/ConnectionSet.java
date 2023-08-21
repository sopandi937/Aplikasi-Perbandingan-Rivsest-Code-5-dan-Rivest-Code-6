/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Connection;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author USER
 */
public class ConnectionSet {

    Connection con;
    public Connection getConnect() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/analisis?serverTimezone=UTC", "root", "");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return con;
    }
}
