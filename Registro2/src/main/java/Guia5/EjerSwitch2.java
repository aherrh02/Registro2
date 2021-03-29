package Guia5;

public class EjerSwitch2 {

    public static void main(String[] args) {
        int dia;
        dia = Entrada.entero();
        String diaEscrito = "";
         
        switch (dia) 
        {
            case 1:  
                diaEscrito = "Lunes";
                break;
            case 2:  
                diaEscrito = "Martes";
                break;
            case 3:
                diaEscrito = "Miercoles";
                break;
            case 4:
                diaEscrito = "Jueves";
                break;
            case 5:
                diaEscrito = "Viernes";
                break;
            case 6:
                diaEscrito = "Sabado";
                break;
            case 7:
                diaEscrito = "Domingo";
                break;
            default:
                break;
        }
        System.out.println(diaEscrito);
    }
    
}
