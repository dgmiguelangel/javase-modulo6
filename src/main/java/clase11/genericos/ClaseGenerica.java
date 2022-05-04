package clase11.genericos;

public class ClaseGenerica<k, v> {

	private k codigo;
	private v numero;	
	
	public ClaseGenerica() {
		super();
	}

	public ClaseGenerica(k codigo, v numero) {
		super();
		this.codigo = codigo;
		this.numero = numero;
	}

	public k getCodigo() {
		return codigo;
	}

	public void setCodigo(k codigo) {
		this.codigo = codigo;
	}

	public v getNumero() {
		return numero;
	}

	public void setNumero(v numero) {
		this.numero = numero;
	}
	
	
}
