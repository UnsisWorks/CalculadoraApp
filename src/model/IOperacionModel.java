package model;

import appCalculadoraMVC.entity.Operacion;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author labtecweb10
 */
public interface IOperacionModel {
    
    public void createRegistro(List<Operacion> lista, Operacion operacion);
    public void showRegistro(List<Operacion> lista, DefaultTableModel model);
    public void deleteRegistro(List<Operacion> lista, int id);

}
