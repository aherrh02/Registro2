package Guia5;

public class EjerSwitch1 {

    public static void main(String[] args) {
        
        int nota;
        System.out.print("Introduzca una nota: ");
        nota = Entrada.entero();
        
        switch(nota) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                System.out.println("INSUFICIENTE");
                break;
            case 5:
                System.out.println("SUFICIENTE");
                break;
            case 6:
                System.out.println("BIEN");
                break;
            case 7:
                break;
            case 8:
                System.out.println("NOTABLE");
                break;
            case 9:
                break;
            case 10:
                System.out.println("SOBRESALIENTE");
                break;
            default:
                System.out.println("ERROR");
                break;
        }
        
    }
    
}
