package controller;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import service.IOperacionService;
import service.OperacionServiceImpl;

public class CalculadoraController {

    /**
     * Descripcion: Divide la exprecion aritmetica en tokents
     * (valls: + / - / * / ^ / √)
     * @param exp es la variable que contiene la exprecion aritmtica de 
     * la operacion
     */
    
//    Conexion del controleer con el srvicio
    IOperacionService service = new OperacionServiceImpl();
    
    public void getToken(String exp) {
        System.out.println("Exprecion : " +  exp);
        String regex = "[\\d.]+|[-,+,*,/,%,^,√]";
        Pattern patron = Pattern.compile(regex);
        Matcher coincidencia = patron.matcher(exp);
        
        coincidencia.find();
    
        System.out.println("Val1: " + coincidencia.group());
    }
}
