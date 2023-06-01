/****************************************
 * Autor: Gómez Hernández Yael Alberto  *
 * Creado: 24/05/2023                   *
 * Modificado: 24/05/2023               *
 * Descripciòn: Clase Suma              *
 ***************************************/
package appCalculadoraMVC.entity;

public class Suma extends Operacion{
    
    public Suma(double valor1, double valor2){
        super(valor1, valor2);
    }
    
    /**
     * Método para sumar los dos valores
     */
    @Override
    public void operar() {
        this.setResultado(this.getValor1() + this.getValor2());
    }
}
