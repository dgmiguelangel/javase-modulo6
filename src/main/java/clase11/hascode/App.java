package clase11.hascode;

public class App {

	public static void main(String[] args) {
		
		Auto a1 = new Auto("rojo", "fiat", new Patente("abc111", true), true);
		Auto a2 = new Auto("azul", "peugeot", new Patente("abc112", true), true);
		
		System.out.println("auto1 == auto2: " + a1.equals(a2));

	}

}
