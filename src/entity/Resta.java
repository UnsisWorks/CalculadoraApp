/****************************************
 * Autor: Gómez Hernández Yael Alberto  *
 * Creado: 24/05/2023                   *
 * Modificado: 24/05/2023               *
 * Descripciòn: Clase Resta             *
 ***************************************/
package appCalculadoraMVC.entity;


public class Resta extends Operacion{

    public Resta(double valor1, double valor2) {
        super(valor1, valor2);
    }

    
    
    @Override
    public void operar() {
        this.setResultado(this.getValor1() - this.getValor2());
    }
    
}
