/****************************************
 * Autor: Gómez Hernández Yael Alberto  *
 * Creado: 24/05/2023                   *
 * Modificado: 24/05/2023               *
 * Descripciòn: Clase Division          *
 ***************************************/
package appCalculadoraMVC.entity;

public class Division extends Operacion{

    public Division(double valor1, double valor2) {
        super(valor1, valor2);
    }
    
    
    @Override
    public void operar() {
        this.resultado = valor1 / valor2;
    }
    
}
