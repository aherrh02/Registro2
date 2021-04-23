package Guia6;

public class EjercicioClassMain {

	public static void main(String[] args) {
		
		VideojuegosPS4 gta = new VideojuegosPS4();
		
		gta.setName("Grand Theft Auto 5");
		gta.setDesarrolladora("Rockstar Games");
		gta.setPrecio(59.9);

		System.out.println("El videojuego " + gta.getName() + " desarrollado por " + gta.getDesarrolladora() + " con un precio de " + gta.getPrecio() + " dolares.");
		System.out.println("Juego desarrollado para " + VideojuegosPS4.plataforma + " con un minimo de horas de " + VideojuegosPS4.minimoHoras);
		
		if(gta instanceof VideojuegosPS4) {
			System.out.println("GTA es un videojuego de PS4");
		} else {
			System.out.println("GTA es un videojuego de PC");
		}
		
	}

}
