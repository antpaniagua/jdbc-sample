/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package centrosmysql;

import entorno.IntroFrame;

/**
 *
 * @author Antonio
 */
public class CentrosMySQL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ClassNotFoundException {
        //Schedule a job for the event-dispatching thread:
        //creating and showing this application's GUI.
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                IntroFrame intro = new IntroFrame();
                intro.pack();
                intro.setVisible(true);

//                MainFrame principal = new MainFrame();
                //               principal.setVisible(true);
            }
        });

//        Test de provincia 
//        ADOProvincia consProvincia = new ADOProvincia(7);
//        Provincia objProv = consProvincia.getObjProvincia();
//        System.out.println(objProv.getProvincia());
//        Test de localidad
//        ADOLocalidad consLocalidad = new ADOLocalidad(20);
//        Localidad objLoc = consLocalidad.getObjLocalidad();
//        System.out.println(objLoc);
//        Test de listado de centro
//        ADOCentro consulta = new ADOCentro();
//        ArrayList<Centro> listado = consulta.getListaCentro();
//        int contador = 0;
//        Centro objCentro;
//        while (!listado.isEmpty()) {
//            objCentro = listado.get(contador++);
//            System.out.println(objCentro);
//        }
//        Test de actualización de centro
//        ADOCentro consulta = new ADOCentro(5);
//        Centro objCentro;
//        objCentro = consulta.getObjCentro();
//        System.out.println(objCentro);
//        objCentro.setVisible(1);
//        consulta.updateCentro(objCentro);
//        // Consultamos de nuevo para ver el cambio
//        objCentro = consulta.getObjCentro();
//        System.out.println(objCentro);
//      Test de insert
//        ADOCentro consulta = new ADOCentro();
        //       Centro objCentro = new Centro(consulta.getUltimoIdCentro() + 1, 2, "", "IES Nuevo", "C/ Nueva, S/N", 1);
        //      consulta.insertCentro(objCentro);
//Test de borrado
//ADOCentro consulta = new ADOCentro(948);
//Centro obj = consulta.getObjCentro();
//consulta.deleteCentro(obj);
//Test vista combinada
//ADOCentro cCen = new ADOCentro(4);
//Centro objCentro = cCen.getObjCentro();
//        
//        ADOLocalidad cLoc = new ADOLocalidad (objCentro.getLocalidadIdLocalidad());
//        Localidad objLocalidad = cLoc.getObjLocalidad();
//        
//        ADOProvincia cProv = new ADOProvincia (objLocalidad.getProvinciaIdProvincia());
//        Provincia objProvincia = cProv.getObjProvincia();
//        
//        System.out.println("Datos del centro");
//        System.out.println("-----------------------------------------------------------");
//        System.out.println(objCentro.getIdCentro()+". "+objCentro.getNombre()+" ("+objCentro.getGeneroCentro()+")");
//        System.out.println(objCentro.getDireccion()+". "+objLocalidad.getCodpostal()+" "+objLocalidad.getLocalidad()+" ("+objProvincia.getProvincia()+")");
//
//Test con objeto Centro Localidad Provincia
        //       ADOCentroLocalidadProvincia cCPL = new ADOCentroLocalidadProvincia(5);
        //       CentroLocalidadProvincia objCPL = cCPL.getObjCPL();
        //       System.out.println(objCPL);
//        
//        ADOLocalidad cLoc = new ADOLocalidad (objCentro.getLocalidadIdLocalidad());
//        Localidad objLocalidad = cLoc.getObjLocalidad();
//        
//        ADOProvincia cProv = new ADOProvincia (objLocalidad.getProvinciaIdProvincia());
//        Provincia objProvincia = cProv.getObjProvincia();
//        
//        System.out.println("Datos del centro");
//        System.out.println("-----------------------------------------------------------");
//        System.out.println(objCentro.getIdCentro()+". "+objCentro.getNombre()+" ("+objCentro.getGeneroCentro()+")");
//        System.out.println(objCentro.getDireccion()+". "+objLocalidad.getCodpostal()+" "+objLocalidad.getLocalidad()+" ("+objProvincia.getProvincia()+")");
//
    }

}
