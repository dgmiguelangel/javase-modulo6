package clase11.colecciones.set.hashset;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class App {

	public static void main(String[] args) {
		
		Set<String> nombres = new HashSet<>();
		
		nombres.add("juan");// agregamos un elemanto
		nombres.add("pedro");
		nombres.add("maria");
		nombres.add("maria");
		
		System.out.println("contiene juan: " + nombres.contains("juan")); // si contiene un elemento
		
		nombres.remove("juan"); //eliminamos un elemento

		System.out.println("contiene juan: " + nombres.contains("juan"));
		
		Iterator<String> it = nombres.iterator();//iteramos la lista con un iterador
		while(it.hasNext()) {
			String s = it.next();
			System.out.println(s);			
		}
		
		nombres.clear();//limpiamos la lista
		
		System.out.println("la coleccion esta vacia? " + nombres.isEmpty());//si esta vacia
	}

}
