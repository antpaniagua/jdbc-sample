/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import entidades.Provincia;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Antonio Paniagua <antoniopaniagua@iescastelar.com>
 */
public class ADOProvincia extends DataBase {

    private Provincia objProvincia;
    private ArrayList<Provincia> listaProvincia  = new ArrayList<>();

    /**
     * Devuelve el identificador y el nombre de la provincia indicada
     *
     * @param idProvincia
     */
    public ADOProvincia(int idProvincia) {
        try {
            Connection conn = getConnection();  //Heredado
            ResultSet resultado = lanzarConsulta("SELECT id_provincia,provincia from provincias where id_provincia = '" + idProvincia + "'");
            while (resultado.next()) {
                objProvincia = new Provincia(resultado.getInt("id_provincia"), resultado.getString("provincia"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(ADOProvincia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Constructor. Devuelve todas las entradas de la tabla
     */
    public ADOProvincia() {
        try {
            Connection conn = getConnection();  //Heredado
            ResultSet resultado = lanzarConsulta("SELECT id_provincia,provincia from provincias");
            while (resultado.next()) {
                objProvincia = new Provincia(resultado.getInt("id_provincia"), resultado.getString("provincia"));
                listaProvincia.add(objProvincia);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ADOProvincia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Provincia getObjProvincia() {
        return objProvincia;
    }

    public ArrayList<Provincia> getListaProvincia() {
        return listaProvincia;
    }
}
