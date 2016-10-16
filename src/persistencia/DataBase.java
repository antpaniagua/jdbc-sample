/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

/**
 *
 * @author Antonio Paniagua <antoniopaniagua@iescastelar.com>
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class DataBase {

    private static Connection conn;
    private Statement stmt;

    public DataBase() {
    }

    public Connection getConnection() {
        try {
            conn = null;
            String userName = "acadt";
            String password = "acadt";
            String url = "jdbc:mysql://192.168.56.101:3306/acadt?autoReconnect=true&useSSL=false";

            try {
                Class.forName("com.mysql.jdbc.Driver").newInstance();  //Registro del driver
                conn = DriverManager.getConnection(url, userName, password);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(DataBase.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, "Error de conexión con la base de datos");
                System.exit(0);
            }
        } catch (InstantiationException ex) {
            Logger.getLogger(DataBase.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(DataBase.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(DataBase.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Error SQL con la base de datos");
            System.exit(0);
        }
        return conn;
    }

    public ResultSet lanzarConsulta(String sentencia) {
        ResultSet resultado = null;
        try {
            Statement consulta = conn.createStatement();
            resultado = consulta.executeQuery(sentencia);
        } catch (SQLException ex) {
            Logger.getLogger(DataBase.class.getName()).log(Level.SEVERE, null, ex);
        }
        return resultado;
    }

    public boolean modificarRegistro(String sentencia) {
        boolean resultado = true;
        try {
            Statement consulta = conn.createStatement();
            consulta.execute(sentencia);
        } catch (SQLException ex) {
            Logger.getLogger(DataBase.class.getName()).log(Level.SEVERE, null, ex);
            resultado = false;
        }
        return resultado;
    }

    public void close() {
        try {
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(DataBase.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
