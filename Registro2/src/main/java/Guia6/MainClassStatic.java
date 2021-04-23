package Guia6;

public class MainClassStatic {

	public static void main(String[] args) {
		
		System.out.println(Coche.numeroRuedas);
		System.out.println("El coche tiene su timon de lado: " + Coche.timon);
		System.out.println("El método retorna: " + Coche.arrancar());
		System.out.println("El método retorna: " + Coche.frenar());
		System.out.println("El método retorna: " + Coche.girar());
		System.out.println("El método retorna: " + Coche.combustible());
		
		Coche toyota = new Coche();
		toyota.setColor("Rojo");
		System.out.println("El color del carro es: " + toyota.getColor());
		
		toyota.setVelocidad(100);
		System.out.println("La velocidad maxima del carro es: " + toyota.getVelocidad());
		
		toyota.setTamano(7);
		System.out.println("El tamaño del carro es: " + toyota.getTamano());
		
		if(toyota instanceof Coche) {
			System.out.println("En efecto, toyota es instancia de Coche");
		} else {
			System.out.println("El carro toyota no es instancia de Coche");
		}
		
	}

}
