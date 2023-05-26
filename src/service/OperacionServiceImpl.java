package service;

import model.IOperacionModel;
import model.OperacionModelImpl;

/**
 *
 * @author labtecweb10
 */
public class OperacionServiceImpl implements IOperacionService {

    // Conectar el servicio con el model/o
    // Agregacion dependencia debiIl
    
    IOperacionModel model = new OperacionModelImpl();
    
    @Override
    public void createRegistro() {
  
    }

    @Override
    public void showRegistro() {
        
    } 
    

    @Override
    public void deleteRegistro() {
        
    }
//    
}
