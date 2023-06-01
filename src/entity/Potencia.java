/****************************************
 * Autor: Gómez Hernández Yael Alberto  *
 * Creado: 24/05/2023                   *
 * Modificado: 24/05/2023               *
 * Descripciòn: Clase Potencia          *
 ***************************************/
package appCalculadoraMVC.entity;

public class Potencia extends Operacion{

    public Potencia(double valor1, double valor2) {
        super(valor1, valor2);
    }
    
    
    @Override
    public void operar() {
        this.setResultado(Math.pow(this.getValor1(), this.getValor2()));
    }
    
}
