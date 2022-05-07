package clase12.colecciones.treeset.comparable;

import java.util.Objects;

public final class Patente {

	private String numero;
	private boolean activa;
	
	public Patente(String numero, boolean activa) {
		super();
		this.numero = numero;
		this.activa = activa;
	}
	

	@Override
	public int hashCode() {
		return Objects.hash(numero);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Patente other = (Patente) obj;
		return Objects.equals(numero, other.numero);
	}



	@Override
	public String toString() {
		return "Patente [numero=" + numero + ", activa=" + activa + "]";
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public boolean isActiva() {
		return activa;
	}

	public void setActiva(boolean activa) {
		this.activa = activa;
	}
	
	
	
}
