package model;

import appCalculadoraMVC.entity.Operacion;
import java.util.List;
import javax.swing.table.DefaultTableModel;


public class OperacionModelImpl implements IOperacionModel {

    @Override
    public void createRegistro(List<Operacion> lista, Operacion operacion) {
        operacion.setId(lista.size() + 1);
        lista.add(operacion);
        
    }

    @Override
    public void showRegistro(List<Operacion> lista, DefaultTableModel model) {
     
//        Recorrer la lista 
        for (Operacion operacion : lista) {
            Object fila[] = new Object[5];
            fila[0] = operacion.getId();
            fila[1] = operacion.getValor1();
            fila[2] = operacion.getOp();
            fila[3] = operacion.getValor2();
            fila[4] = operacion.getResultado();
            
            model.addRow(fila);
        }
    }

    @Override
    public void deleteRegistro(List<Operacion> lista, int id) {
        for (Operacion operacion : lista) {
            if (id == operacion.getId()) {
                lista.remove(operacion);
            }
        }
    }

    

    
}
