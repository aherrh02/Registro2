package Guia5;

public class EjerWhile1 {

    public static void main(String[] args) {
        
        int num;
        System.out.println("Introduzca un numero: ");
        num = Entrada.entero();
        
        while( num > 0 ) {
            
            if( num > 0 ) {
                System.out.println("Positivo");
            } else {
                System.out.println("Negativo");
            }
            
            System.out.println("Introduzca otro numero: ");
            num = Entrada.entero();
        }
           
        
    }
    
}
