package clase11.enumeraciones;

public class App2 {

	public static void main(String[] args) {
		
		Colores c = Colores.valueOf("AZUL");
		System.out.println(Colores.AZUL);
		System.out.println(c.name());
		System.out.println(c.getHexa());
		System.out.println(c.getRgb());
	}

}
