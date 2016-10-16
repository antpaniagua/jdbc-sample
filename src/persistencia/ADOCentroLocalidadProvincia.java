/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import entidades.Centro;
import entidades.CentroLocalidadProvincia;
import entidades.Provincia;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Antonio Paniagua <antoniopaniagua@iescastelar.com>
 */
public class ADOCentroLocalidadProvincia extends DataBase {

    private CentroLocalidadProvincia objCLP;
    private ArrayList<CentroLocalidadProvincia> listaCLP = new ArrayList<>();

    public ADOCentroLocalidadProvincia(int idCentro) {
        try {
            Connection conn = getConnection();  //Heredado
            ResultSet resultado = lanzarConsulta("SELECT id_centro,generocentro,nombre,direccion,localidades.codpostal,localidades.localidad,provincias.provincia,visible from centros "
                    + "left join localidades on centros.cpr_localidad0_id_localidad=localidades.id_localidad "
                    + "left join provincias on provincias.id_provincia = localidades.cpr_provincia0_id_provincia "
                    + " where id_centro = '" + idCentro + "'");
            while (resultado.next()) {
                objCLP = new CentroLocalidadProvincia(resultado.getInt("id_centro"), resultado.getString("generocentro"), resultado.getString("nombre"), resultado.getString("direccion"), resultado.getString("localidades.codpostal"), resultado.getString("localidades.localidad"), resultado.getString("provincias.provincia"), resultado.getInt("visible"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(ADOCentroLocalidadProvincia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Constructor. Devuelve todas las entradas de la tabla
     */
    public ADOCentroLocalidadProvincia() {
        try {
            Connection conn = getConnection();  //Heredado
            ResultSet resultado = lanzarConsulta("SELECT id_centro,generocentro,nombre,direccion,localidades.codpostal,localidades.localidad,provincias.provincia,visible from centros "
                    + "left join localidades on centros.cpr_localidad0_id_localidad=localidades.id_localidad "
                    + "left join provincias on provincias.id_provincia = localidades.cpr_provincia0_id_provincia ");
            while (resultado.next()) {
                objCLP = new CentroLocalidadProvincia(resultado.getInt("id_centro"), resultado.getString("generocentro"), resultado.getString("nombre"), resultado.getString("direccion"), resultado.getString("localidades.codpostal"), resultado.getString("localidades.localidad"), resultado.getString("provincias.provincia"), resultado.getInt("visible"));
                listaCLP.add(objCLP);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ADOCentroLocalidadProvincia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }


    public CentroLocalidadProvincia getObjCPL() {
        return objCLP;
    }

    public ArrayList<CentroLocalidadProvincia> getListaCPL() {
        return listaCLP;
    }
}
