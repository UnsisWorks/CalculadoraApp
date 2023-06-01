package controller;

import appCalculadoraMVC.entity.Operacion;
import appCalculadoraMVC.entity.Suma;
import entity.Token;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.table.DefaultTableModel;
import service.IOperacionService;
import service.OperacionServiceImpl;

public class CalculadoraController {

    /**
     * Descripcion: Divide la exprecion aritmetica en tokents (valls: + / - / *
     * / ^ / √)
     *
     * @param exp es la variable que contiene la exprecion aritmtica de la
     * operacion
     */
//    Conexion del controleer con el srvicio
    IOperacionService service = new OperacionServiceImpl();

    public void getToken(String exp) {
        System.out.println("Exprecion : " + exp);
        String regex = "[\\d.]+|[-,+,*,/,%,^,√,!]";
        Pattern patron = Pattern.compile(regex);
        Matcher coincidencia = patron.matcher(exp);

        coincidencia.find();

        System.out.println("Val1: " + coincidencia.group());
    }

    /**
     *
     * @param expresion
     */
    public void realizarOperacion(List lista, String expresion, DefaultTableModel model) {
        Token token = new Token();
        // Despedazar la expresion
        token.getSplitToken(expresion);
        System.out.println("token = " + token);

        Operacion operacion;

        switch (token.getOp()) {
            case '+':
                operacion = new Suma(token.getVal1(), token.getVal2());
                operacion.setOp('+');
                break;
            case '-':
                operacion = new Suma(token.getVal1(), token.getVal2());
                break;
            case '*':
                operacion = new Suma(token.getVal1(), token.getVal2());
                break;
            case '^':
                operacion = new Suma(token.getVal1(), token.getVal2());
                break;
            case '/':
                operacion = new Suma(token.getVal1(), token.getVal2());
                break;
            case '√':
                operacion = new Suma(token.getVal1(), token.getVal2());
                break;
            default:
                throw new AssertionError();
        }
        operacion.operar();
        service.createRegistro(lista, operacion);
        service.showRegistro(lista, model);
        operacion.imprimirResultado();
    }
}
