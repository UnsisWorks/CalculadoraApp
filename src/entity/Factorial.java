package entity;

import appCalculadoraMVC.entity.Operacion;

/**
 *
 * @author labtecweb10
 */
public class Factorial extends Operacion {

    public Factorial(double valor1, double valor2) {
        super(valor1, valor2);
    }

    @Override
    public void operar() {
        this.setResultado(this.getValor1() / this.getValor2());
    }
    
    public double calcular () {
//        if (valor1 == 1) {
//            return 1;
//        } else {
//            
//            return calcular() * valor2--;
//        }
return 0;
    }
    
}
