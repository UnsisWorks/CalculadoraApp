/****************************************
 * Autor: Gómez Hernández Yael Alberto  *
 * Creado: 24/05/2023                   *
 * Modificado: 24/05/2023               *
 * Descripciòn: Clase Multiplicacion    *
 ***************************************/
package appCalculadoraMVC.entity;

public class Multiplicacion extends Operacion{

    public Multiplicacion(double valor1, double valor2) {
        super(valor1, valor2);
    }
    
    
    @Override
    public void operar() {
        this.resultado = valor1 * valor2;
    }
    
    
}
