/****************************************
 * Autor: Gómez Hernández Yael Alberto  *
 * Creado: 24/05/2023                   *
 * Modificado: 24/05/2023               *
 * Descripciòn: Clase Suma              *
 ***************************************/
package appCalculadoraMVC.entity;

public abstract class Operacion {
    public double valor1;
    public double valor2;
    public double resultado;
    
    public Operacion(double valor1, double valor2){
        this.valor1 = valor1;
        this.valor2 = valor2;
    }
    
    /**
     * Método para mostrar el resultado de la operación en pantalla
     */
    public void imprimirResultado(){
            System.out.println("Resultado: " + resultado);
    }
    
    /**
     * Método para realizar la operación
     */
    public abstract void operar();
        
    
}
