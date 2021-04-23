package Guia6;

public class Coche {
	
	private String color;
	private int velocidad;
	private float tamano;
	public static int numeroRuedas = 4;
	public static final String timon = "Izquierda"; 
	
	public static String arrancar() {
		return "El coche arrancó";
	}
	
	public static String frenar() {
		return "El coche frenó";
	}
	
	public static String girar() {
		return "El coche ejecutó un giro";
	}
	
	public static String combustible() {
		return "El coche cargó combustible";
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}

	public float getTamano() {
		return tamano;
	}

	public void setTamano(float tamano) {
		this.tamano = tamano;
	}

	public static int getNumeroRuedas() {
		return numeroRuedas;
	}

	public static void setNumeroRuedas(int numeroRuedas) {
		Coche.numeroRuedas = numeroRuedas;
	}

	
	
}
