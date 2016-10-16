/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import entidades.Centro;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Antonio Paniagua <antoniopaniagua@iescastelar.com>
 */
public class ModeloListadoCentros extends AbstractTableModel {

    private ResultSet resultSet;
    private ResultSetMetaData metaData;
    private ArrayList<Centro> listaCentro = new ArrayList<>();
    private int numberOfRows;
    private int numberOfCols;

    public ModeloListadoCentros() {
        try {
            ADOCentro registroCentro = new ADOCentro();
            this.resultSet = registroCentro.getResultSetAllCentros();
            this.metaData = registroCentro.getMetadataResultSetAllCentros();
            resultSet.last();
            numberOfRows = resultSet.getRow();
            fireTableStructureChanged();
        } catch (SQLException ex) {
            Logger.getLogger(ModeloListadoCentros.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public int getColumnCount() {
        int cols =  0;
        try {
            cols  = metaData.getColumnCount();
        } catch (SQLException ex) {
            Logger.getLogger(ModeloListadoCentros.class.getName()).log(Level.SEVERE, null, ex);
        }
        return cols;
    }
    
    public String getColumnName(int column) {
        try {
            return metaData.getColumnName(column+1);
        } catch (SQLException ex) {
            Logger.getLogger(ModeloListadoCentros.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "";
    }
    public Object getValueAt(int row, int col) {
        try {
            resultSet.absolute(row + 1);
            return resultSet.getObject(col + 1);
        } catch (SQLException ex) {
            Logger.getLogger(ModeloListadoCentros.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }
    

    @Override
    public int getRowCount() {
        return numberOfRows;
    }

}
