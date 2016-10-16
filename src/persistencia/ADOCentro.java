/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import entidades.Centro;
import entidades.Provincia;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Antonio Paniagua <antoniopaniagua@iescastelar.com>
 */
public class ADOCentro extends DataBase {

    private Centro objCentro;
    private ArrayList<Centro> listaCentro = new ArrayList<>();
    private ResultSet resultSet;

    /**
     * Devuelve el identificador y los datos del centro
     *
     * @param idCentro
     */
    public ADOCentro(int idCentro) {
        try {
            Connection conn = getConnection();  //Heredado
            ResultSet resultado = lanzarConsulta("SELECT id_centro,cpr_localidad0_id_localidad,generocentro,nombre,direccion,visible from centros where id_centro = '" + idCentro + "'");
            while (resultado.next()) {
                objCentro = new Centro(resultado.getInt("id_centro"), resultado.getInt("cpr_localidad0_id_localidad"), resultado.getString("generocentro"), resultado.getString("nombre"), resultado.getString("direccion"), resultado.getInt("visible"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(ADOCentro.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Constructor. Devuelve todas las entradas de la tabla
     */
    public ADOCentro() {
        try {
            Connection conn = getConnection();  //Heredado
            ResultSet resultado = lanzarConsulta("SELECT id_centro,cpr_localidad0_id_localidad,generocentro,nombre,direccion,visible from centros");
            while (resultado.next()) {
                objCentro = new Centro(resultado.getInt("id_centro"), resultado.getInt("cpr_localidad0_id_localidad"), resultado.getString("generocentro"), resultado.getString("nombre"), resultado.getString("direccion"), resultado.getInt("visible"));
                listaCentro.add(objCentro);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ADOCentro.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Centro getCentro(int idCentro) {
        Centro objCentro = new Centro();
        try {
            Connection conn = getConnection();  //Heredado
            ResultSet resultado = lanzarConsulta("SELECT id_centro,cpr_localidad0_id_localidad,generocentro,nombre,direccion,visible from centros where id_centro = '" + idCentro + "'");
            while (resultado.next()) {
                objCentro = new Centro(resultado.getInt("id_centro"), resultado.getInt("cpr_localidad0_id_localidad"), resultado.getString("generocentro"), resultado.getString("nombre"), resultado.getString("direccion"), resultado.getInt("visible"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(ADOCentro.class.getName()).log(Level.SEVERE, null, ex);
        }
        return objCentro;
    }

    public ResultSet getResultSetAllCentros() {
        ResultSet resultado = null;
        Connection conn = getConnection();
        resultado = lanzarConsulta("SELECT id_centro,cpr_localidad0_id_localidad,generocentro,nombre,direccion,visible from centros");
        return resultado;
    }

    public ResultSetMetaData getMetadataResultSetAllCentros() {
        ResultSet resultado = null;
        ResultSetMetaData metaData = null;
        Connection conn = getConnection();

        try {
            resultado = lanzarConsulta("SELECT id_centro,cpr_localidad0_id_localidad,generocentro,nombre,direccion,visible from centros");
            metaData = resultado.getMetaData();
        } catch (SQLException ex) {
            Logger.getLogger(ADOCentro.class.getName()).log(Level.SEVERE, null, ex);
        }
        return metaData;
    }

    public boolean insertCentro(Centro obj) {
        Connection conn = getConnection();  //Heredado
        String secuencia = "insert into centros values ('"
                + obj.getIdCentro() + "','"
                + obj.getLocalidadIdLocalidad() + "','"
                + obj.getTipocentroIdTipocentro() + "','"
                + obj.getGeneroCentro() + "','"
                + "0" + "','" //cod_centro
                + obj.getNombre() + "','"
                + obj.getDireccion() + "','"
                + obj.getCodPostal() + "','"
                + obj.getVisible() + "')";
        return modificarRegistro(secuencia);
    }

    public boolean updateCentro(Centro obj) {
        Connection conn = getConnection();  //Heredado
        return modificarRegistro("update centros set cpr_localidad0_id_localidad='" + obj.getLocalidadIdLocalidad()
                + "', nombre='" + obj.getNombre()
                + "', direccion='" + obj.getDireccion()
                + "', visible='" + obj.getVisible()
                + "' where id_centro='" + obj.getIdCentro()
                + "'; ");
    }

    public boolean deleteCentro(Centro obj) {
        try {
            Connection conn = getConnection();  //Heredado
            return modificarRegistro("delete from centros "
                    + " where id_centro='" + obj.getIdCentro()
                    + "'; ");
        } catch (NullPointerException e) {
            return false;
        }
    }

    public int getUltimoIdCentro() {
        int id = -1;
        try {
            Connection conn = getConnection();  //Heredado
            ResultSet resultado = lanzarConsulta("SELECT max(id_centro) AS id_centro from centros");
            while (resultado.next()) {
                id = resultado.getInt("id_centro");
            }
        } catch (SQLException ex) {
            Logger.getLogger(ADOCentro.class.getName()).log(Level.SEVERE, null, ex);
        }
        return id;
    }

    public Centro getObjCentro() {
        return objCentro;
    }

    public ArrayList<Centro> getListaCentro() {
        return listaCentro;
    }

    public ResultSet getResultSet() {
        return resultSet;
    }

}
