package clase11.enumeraciones;

public class App {

	public static void main(String[] args) {
		
		Color c = Color.valueOf("AZUL");
		System.out.println(c.name());
		System.out.println(c.ordinal());
		
		System.out.println(Color.AZUL);

	}

}
