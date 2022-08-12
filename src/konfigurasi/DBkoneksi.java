/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package konfigurasi;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.*;

/**
 *
 * @author user
 */
public class DBkoneksi {
    public Connection koneksi;
    
    public Connection connect(){
        //koneksi ke driver mysql
        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("berhasil koneksi ke jdbc Driver mysql");
        } catch (ClassNotFoundException ex) {
            System.out.println("tidak berhasil koneksi ke jdbc driver mysql");
        }
        //koneksi ke database
        try {
            String url = "jdbc:mysql://localhost:3306/datamhs";
            koneksi = (Connection) DriverManager.getConnection(url,"root","");
            System.out.println("berhasil koneksi ke database");
        } catch (SQLException e) {
            System.out.println("tidak berhasil koneksi ke database");
        }
        return koneksi;
 
    }
    
    public static void main(String[] args) {
        java.sql.Connection conn = new DBkoneksi().connect();
    }
}
