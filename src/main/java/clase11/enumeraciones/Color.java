package clase11.enumeraciones;

public enum Color {
	
	NEGRO(), AZUL(), MARRON, GRIS;
	
	private Color() {
		System.out.println("accediendo al constructor privado");
	}

}
