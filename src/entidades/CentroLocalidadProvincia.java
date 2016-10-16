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
public class CentroLocalidadProvincia {
    private int idCentro;
    private int tipocentroIdTipocentro;
    private String generoCentro;
    private String nombre;
    private String direccion;
    private String codPostal;
    private String localidad;
    private String provincia;
    private int visible;

    /**
     *
     * @param idCentro
     * @param localidadIdLocalidad
     * @param nombre
     * @param direccion
     * @param codPostal
     */
    public CentroLocalidadProvincia(int idCentro, String generoCentro, String nombre, String direccion, String codPostal, String localidad, String provincia, int visible) {
        this();
        this.idCentro = idCentro;
        this.generoCentro = generoCentro;
        this.nombre = nombre;
        this.direccion = direccion;
        this.codPostal = codPostal;
        this.localidad = localidad;
        this.provincia = provincia;
        this.visible = visible;
    }

    /**
     *
     * @param nombre
     * @param direccion
     */
    public CentroLocalidadProvincia(String nombre) {
        this();
        this.nombre = nombre;
    }

    /**
     *
     */
    public CentroLocalidadProvincia() {
        this.idCentro = 0;
        this.tipocentroIdTipocentro = 0;
        this.generoCentro = "";
        this.nombre = "";
        this.direccion = "";
        this.codPostal = "";
        this.localidad = "";
        this.provincia = "";
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

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    @Override
    public String toString() {
        String secuencia = "\nDatos del centro"
                + "\n-----------------------------------------------------------"
                + "\n" + getIdCentro()+". "+getNombre()+" ("+getGeneroCentro()+")"
                + "\n" + getDireccion()+". "+getCodPostal()+" "+ getLocalidad()+" ("+getProvincia()+")";
        
        return secuencia;
    }

    


}
