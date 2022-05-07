package clase11.colecciones.list.arraylist;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class App {

	public static void main(String[] args) {
		
		List<String> nombres = new ArrayList<>();
		
		nombres.add("juan");
		nombres.add("pedro");
		nombres.add("maria");
		nombres.add("maria");
		
		System.out.println("contiene juan: " + nombres.contains("juan")); 
		
		nombres.remove("juan"); 

		System.out.println("contiene juan: " + nombres.contains("juan"));
		
		nombres.add(0, "marcela");
		nombres.set(0, "marcia");
		
		System.out.println(nombres.indexOf("maria"));
		System.out.println(nombres.lastIndexOf("maria"));
		
		
		
		ListIterator<String> it = nombres.listIterator();
		while(it.hasNext()) {
			System.out.println(it.next());			
		}
		
		while(it.hasPrevious()) {
			System.out.println(it.previous());
		}
		
		nombres.clear();
		
		System.out.println("la coleccion esta vacia? " + nombres.isEmpty());
	}

}
