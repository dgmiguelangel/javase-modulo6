package clase11.genericos;

public class App {

	public static void main(String[] args) {

		ClaseGenerica<Integer, Integer> telefono = new ClaseGenerica<Integer, Integer>();
		telefono.setCodigo(54);
		telefono.setNumero(54145874);

		System.out.println("codigo: " + telefono.getCodigo() + ", numero: " + telefono.getNumero());

		ClaseGenerica<String, Integer> documento = new ClaseGenerica<String, Integer>("DNI", 20458741);

		System.out.println("tipodocu: " + documento.getCodigo() + ", numero: " + documento.getNumero());

	}

}
