package Guia5;

public class EjerWhile2 {

    public static void main(String[] args) {
        
        String text = Entrada.cadena();
        
        int posicion = 0;
        while (posicion < text.length()) {
            
            System.out.println("Letra " + (posicion+1) + ": " + text.charAt(posicion));
            
            posicion++;
        }
        
    }
    
}
