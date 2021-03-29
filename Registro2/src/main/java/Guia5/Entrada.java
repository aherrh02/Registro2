
package Guia5;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Entrada {
    
    static String inicializar(){
        String buzon="";
        InputStreamReader flujo = new InputStreamReader(System.in);
        BufferedReader teclado = new BufferedReader(flujo);
        
        try {
            buzon = teclado.readLine();
        } catch (Exception e) {
            System.out.append("Entrada incorrecta: " + e);
        }
        
        return buzon;
    }
    
    static int entero() {
        int valor = Integer.parseInt(inicializar());
        return valor;
    }
    
    static Double real() {
        Double valor = Double.parseDouble(inicializar());
        return valor;
    }
    
    static String cadena() {
        String valor = inicializar();
        return valor;
    }
    
    static char caracter() {
        String valor = inicializar();
        return valor.charAt(0);
    }
    
}