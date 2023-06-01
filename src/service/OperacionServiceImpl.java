package service;

import appCalculadoraMVC.entity.Operacion;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import model.IOperacionModel;
import model.OperacionModelImpl;

/**
 *
 * @author labtecweb10
 */
public class OperacionServiceImpl implements IOperacionService {

    IOperacionModel model = new OperacionModelImpl();
    
    @Override
    public void createRegistro(List<Operacion> lista, Operacion operacion) {
        model.createRegistro(lista, operacion);
    }

    @Override
    public void showRegistro(List<Operacion> lista, DefaultTableModel model) {
        this.model.showRegistro(lista, model);
    }

    @Override
    public void deleteRegistro(List<Operacion> lista, int id) {
        model.deleteRegistro(lista, id);
    }

     
}
