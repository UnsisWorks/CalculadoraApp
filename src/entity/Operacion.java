/****************************************
 * Autor: Gómez Hernández Yael Alberto  *
 * Creado: 24/05/2023                   *
 * Modificado: 24/05/2023               *
 * Descripciòn: Clase Suma              *
 ***************************************/
package appCalculadoraMVC.entity;

public abstract class Operacion {
    private double valor1;
    private double valor2;
    private double resultado;
    private int id;
    private char op;
    
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

    public double getValor1() {
        return valor1;
    }

    public void setValor1(double valor1) {
        this.valor1 = valor1;
    }

    public double getValor2() {
        return valor2;
    }

    public void setValor2(double valor2) {
        this.valor2 = valor2;
    }

    public double getResultado() {
        return resultado;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public char getOp() {
        return op;
    }

    public void setOp(char op) {
        this.op = op;
    }
    
    
    
}
