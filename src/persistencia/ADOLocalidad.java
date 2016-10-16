/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import entidades.Localidad;
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
public class ADOLocalidad extends DataBase {

    private Localidad objLocalidad;
    private ArrayList<Localidad> listaLocalidad = new ArrayList<>();

    /**
     * Devuelve el identificador y el nombre de la localidad indicada
     *
     * @param idLocalidad
     */
    public ADOLocalidad(int idLocalidad) {
        try {
            Connection conn = getConnection();  //Heredado
            ResultSet resultado = lanzarConsulta("SELECT id_localidad,cpr_provincia0_id_provincia, codpostal, localidad from localidades where id_localidad = '" + idLocalidad + "'");
            while (resultado.next()) {
                objLocalidad = new Localidad(resultado.getInt("id_localidad"), resultado.getInt("cpr_provincia0_id_provincia"), resultado.getString("codpostal"), resultado.getString("localidad"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(ADOLocalidad.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Constructor. Devuelve todas las entradas de la tabla
     */
    public ADOLocalidad() {
        try {
            Connection conn = getConnection();  //Heredado
            ResultSet resultado = lanzarConsulta("SELECT id_localidad,cpr_provincia0_id_provincia, codpostal, localidad from localidades");
            while (resultado.next()) {
                objLocalidad = new Localidad(resultado.getInt("id_localidad"), resultado.getInt("cpr_provincia0_id_provincia"), resultado.getString("codpostal"), resultado.getString("localidad"));
                listaLocalidad.add(objLocalidad);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ADOLocalidad.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void getLocalidadesPorProvincia (int idProvincia) {
        listaLocalidad.removeAll(listaLocalidad);
        try {
            Connection conn = getConnection();  //Heredado
            ResultSet resultado = lanzarConsulta("SELECT id_localidad,cpr_provincia0_id_provincia, codpostal, localidad from localidades where cpr_provincia0_id_provincia = '" + idProvincia + "'");
            while (resultado.next()) {
                objLocalidad = new Localidad(resultado.getInt("id_localidad"), resultado.getInt("cpr_provincia0_id_provincia"), resultado.getString("codpostal"), resultado.getString("localidad"));
                listaLocalidad.add(objLocalidad);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ADOLocalidad.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Localidad getObjLocalidad() {
        return objLocalidad;
    }

    public ArrayList<Localidad> getListaLocalidad() {
        return listaLocalidad;
    }
}
