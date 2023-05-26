package entity;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Token {

    private double val1;
    private double val2;
    private char op;
    
    public Token() {
    }

    /**
     *
     * @param val1
     * @param val2
     * @param op
     */
    public Token(double val1, double val2, char op) {
        this.val1 = val1;
        this.val2 = val2;
        this.op = op;
    }

    /**
     * Descripcion: Divide la exprecion aritmetica en tokents (valls: + / - / *
     * / ^ / √)
     *
     * @param exp es la variable que contiene la exprecion aritmtica de la
     * operacion
     */
    public void getSplitToken(String exp) {
        // String Tokenizer o Exprecions regulares o metodo Split
        System.out.println("Exprecion : " + exp);
        String regex = "[\\d.]+|[-,+,*,/,%,^,√]";
        Pattern patron = Pattern.compile(regex);
        Matcher coincidencia = patron.matcher(exp);

        // Encontram0s el valor
        coincidencia.find();
        
        this.setVal1(Double.parseDouble(coincidencia.group()));
        System.out.println("Val1: " + this.getVal1());

        // Encontram0s el valor
        coincidencia.find();
        
        this.setOp(coincidencia.group().charAt(0));
        
        if (this.op == '√') {

            // Encontram0s el valor
            coincidencia.find();
            
            this.setVal2(Double.parseDouble(coincidencia.group()));
        }
    }
    
    public double getVal1() {
        return val1;
    }
    
    public void setVal1(double val1) {
        this.val1 = val1;
    }
    
    public double getVal2() {
        return val2;
    }
    
    public void setVal2(double val2) {
        this.val2 = val2;
    }
    
    public char getOp() {
        return op;
    }
    
    public void setOp(char op) {
        this.op = op;
    }
    
}
