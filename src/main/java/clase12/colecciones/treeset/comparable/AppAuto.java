package clase12.colecciones.treeset.comparable;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class AppAuto {

	public static void main(String[] args) {
		
		Set<Auto> autos = new TreeSet<Auto>();
		
		Auto a1 = new Auto("rojo", "fiat", new Patente("bbb111", true), true);
		Auto a2 = new Auto("azul", "peugeot", new Patente("aaa112", true), true);
		
		autos.add(a1);
		autos.add(a2);
		
		Iterator<Auto> it = autos.iterator();
		while(it.hasNext()) {
			Auto a = it.next();
			System.out.println(a);
		}


	}

}
