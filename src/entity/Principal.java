/****************************************
 * Autor: Gómez Hernández Yael Alberto  *
 * Creado: 24/05/2023                   *
 * Modificado: 24/05/2023               *
 * Descripciòn: Clase Principal         *
 ***************************************/
package appCalculadoraMVC.entity;

import java.util.ArrayList;
import java.util.List;

public class Principal {
    public static void main(String[] args) {
        List<Operacion> listaOperacion = new ArrayList<>();
        listaOperacion.add(new Suma(2, 7));
        listaOperacion.add(new Resta(2, 7));
        listaOperacion.add(new Multiplicacion(2, 7));
        listaOperacion.add(new Division(2, 7));
        listaOperacion.add(new Potencia(2, 7));
        
        for (Operacion operacion : listaOperacion) {
            operacion.operar();
            operacion.imprimirResultado();
        }
    }
}
