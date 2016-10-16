/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *
 * @author Antonio
 */
public class Localidad {

    private int id_localidad;
    private int provinciaIdProvincia;
    private String codpostal;
    private String localidad;

    public Localidad(int id_localidad, int provinciaIdProvincia, String codpostal, String localidad) {
        this.id_localidad = id_localidad;
        this.provinciaIdProvincia = provinciaIdProvincia;
        this.codpostal = codpostal;
        this.localidad = localidad;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public int getId_localidad() {
        return id_localidad;
    }

    public void setId_localidad(int id_localidad) {
        this.id_localidad = id_localidad;
    }

    public int getProvinciaIdProvincia() {
        return provinciaIdProvincia;
    }

    public void setProvinciaIdProvincia(int provinciaIdProvincia) {
        this.provinciaIdProvincia = provinciaIdProvincia;
    }

    public String getCodpostal() {
        return codpostal;
    }

    public void setCodpostal(String codpostal) {
        this.codpostal = codpostal;
    }

    @Override
    public String toString() {
        return "Localidad{" + "id_localidad=" + id_localidad + ", provinciaIdProvincia=" + provinciaIdProvincia + ", codpostal=" + codpostal + ", localidad=" + localidad + '}';
    }

}
