/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *
 * @author Antonio Paniagua
 */
public class Centro {
    private int idCentro;
    private int localidadIdLocalidad;
    private int tipocentroIdTipocentro;
    private String generoCentro;
    private String nombre;
    private String direccion;
    private String codPostal;
    private int visible;

    /**
     *
     * @param idCentro
     * @param localidadIdLocalidad
     * @param nombre
     * @param direccion
     * @param codPostal
     */
    public Centro(int idCentro, int localidadIdLocalidad, String generoCentro, String nombre, String direccion, int visible) {
        this();
        this.idCentro = idCentro;
        this.localidadIdLocalidad = localidadIdLocalidad;
        this.generoCentro = generoCentro;
        this.nombre = nombre;
        this.direccion = direccion;
        this.visible = visible;
    }

    /**
     *
     * @param nombre
     * @param direccion
     */
    public Centro(String nombre, String direccion) {
        this();
        this.nombre = nombre;
        this.direccion = direccion;
    }

    /**
     *
     */
    public Centro() {
        this.idCentro = 0;
        this.localidadIdLocalidad = 0;
        this.tipocentroIdTipocentro = 0;
        this.generoCentro = "";
        this.nombre = "";
        this.direccion = "";
        this.codPostal = "";
        this.visible = 0;
    }

    /**
     * @return the idCentro
     */
    public int getIdCentro() {
        return idCentro;
    }

    /**
     * @param idCentro the idCentro to set
     */
    public void setIdCentro(int idCentro) {
        this.idCentro = idCentro;
    }

    /**
     * @return the localidadIdLocalidad
     */
    public int getLocalidadIdLocalidad() {
        return localidadIdLocalidad;
    }

    /**
     * @param localidadIdLocalidad the localidadIdLocalidad to set
     */
    public void setLocalidadIdLocalidad(int localidadIdLocalidad) {
        this.localidadIdLocalidad = localidadIdLocalidad;
    }

    /**
     * @return the tipocentroIdTipocentro
     */
    public int getTipocentroIdTipocentro() {
        return tipocentroIdTipocentro;
    }

    /**
     * @param tipocentroIdTipocentro the tipocentroIdTipocentro to set
     */
    public void setTipocentroIdTipocentro(int tipocentroIdTipocentro) {
        this.tipocentroIdTipocentro = tipocentroIdTipocentro;
    }

    /**
     * @return the generoCentro
     */
    public String getGeneroCentro() {
        return generoCentro;
    }

    /**
     * @param generoCentro the generoCentro to set
     */
    public void setGeneroCentro(String generoCentro) {
        this.generoCentro = generoCentro;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the direccion
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * @param direccion the direccion to set
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * @return the codPostal
     */
    public String getCodPostal() {
        return codPostal;
    }

    /**
     * @param codPostal the codPostal to set
     */
    public void setCodPostal(String codPostal) {
        this.codPostal = codPostal;
    }

    /**
     * @return the visible
     */
    public int getVisible() {
        return visible;
    }

    /**
     * @param visible the visible to set
     */
    public void setVisible(int visible) {
        this.visible = visible;
    }

    @Override
    public String toString() {
        return "Centro{" + "idCentro=" + idCentro + ", localidadIdLocalidad=" + localidadIdLocalidad + ", nombre=" + nombre + ", direccion=" + direccion + ", visible=" + visible + '}';
    }

}
