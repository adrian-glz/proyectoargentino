/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reportemtb;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author AGONZALEZ
 */
public class ConexionMySQL  {         
    public String db = "mtbmysql";
    public String url = "jdbc:mysql://localhost:3306/"+db;
    public String user = "root";
    public String pass = "";
    


        public Connection Conectar() {
            Connection link = null;
            try {
                Class.forName("com.mysql.jdbc.Driver");
                link = DriverManager.getConnection(this.url, this.user, this.pass);
                System.out.println("CONEXION EXITOSA"
                        + "");
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "ERROR VERIFIQUE LA CONEXION O COMUNIQUESE CON SISTEMAS" + ex);
            }
            return link;
        }
    }
