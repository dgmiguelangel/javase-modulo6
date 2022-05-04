package clase11.enumeraciones;

public enum Colores {

	NEGRO("000000", "0,0,0"),
	AZUL("0000FF", "0,0,255");	
	
	private String hexa;
	private String rgb;
	
	private Colores(String hexa, String rgb) {
		this.hexa = hexa;
		this.rgb = rgb;
	}

	public String getHexa() {
		return hexa;
	}

	public String getRgb() {
		return rgb;
	}
	
	
}
