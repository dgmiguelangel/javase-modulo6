package clase12.colecciones.treeset.comparable;

import java.time.LocalDate;
import java.time.Period;
import java.util.Objects;

public class Persona implements Comparable<Persona>{

	private String nombre;
	private String apellido;
	private Documento documento;
	private LocalDate fechaNacimiento;

	public Persona() {
		super();
	}

	public Persona(String nombre, String apellido, Documento documento, LocalDate fechaNacimiento) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.documento = documento;
		this.fechaNacimiento = fechaNacimiento;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellido=" + apellido + ", documento=" + documento
				+ ", fechaNacimiento=" + fechaNacimiento + "]";
	}
	
	
	/*
	 * 0  los objetos son iguales
	 * -1 this es menor a o
	 * +1 this es mayor a o
	 */
	
	@Override
	public int compareTo(Persona o) {
		int c = this.getNombre().compareTo(o.getNombre());
		if(c == 0) {
			return this.getApellido().compareTo(o.getApellido());
		}
		return c;
	}

	

	@Override
	public int hashCode() {
		return Objects.hash(documento);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Persona other = (Persona) obj;
		return Objects.equals(documento, other.documento);
	}

	public int calcularEdad() {
		return Period.between(fechaNacimiento, LocalDate.now()).getYears();
	}

	public boolean esMayorEdad() {
		return calcularEdad() >= 18 ? true : false;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public Documento getDocumento() {
		return documento;
	}

	public void setDocumento(Documento documento) {
		this.documento = documento;
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

}
