package clase12.colecciones.treeset.comparable;

import java.util.Objects;

public class Auto implements Comparable<Auto>{
	
	private String color;
	private String marca;
	private Patente patente;
	private boolean encendido;	
	public static String concesionaria;
	
	static {
		concesionaria = "Autos IT";
	}	
	
	public Auto() {
		super();
	}

	public Auto(String color, String marca, Patente patente, boolean encendido) {
		super();
		this.color = color;
		this.marca = marca;
		this.patente = patente;
		this.encendido = encendido;
	}	
	
	
	/*
	 * 0  los objetos son iguales
	 * -1 this es menor a o
	 * +1 this es mayor a o
	 */
	@Override
	public int compareTo(Auto o) {
		return this.getPatente().getNumero().compareTo(o.getPatente().getNumero());
	}
		
			

	@Override
	public int hashCode() {
		return Objects.hash(patente);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Auto other = (Auto) obj;
		return Objects.equals(patente, other.patente);
	}
	
	
	@Override
	public String toString() {
		return "Auto [color=" + color + ", marca=" + marca + ", patente=" + patente + ", encendido=" + encendido + "]";
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public Patente getPatente() {
		return patente;
	}

	public void setPatente(Patente patente) {
		this.patente = patente;
	}

	public boolean isEncendido() {
		return encendido;
	}

	public void setEncendido(boolean encendido) {
		this.encendido = encendido;
	}

	public static void setConcesionaria(String concesionaria) {
		Auto.concesionaria = concesionaria;
	}

	

}
