package clase12.colecciones.treeset.comparable;

import java.time.LocalDate;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class AppPersona {

	public static void main(String[] args) {
		
		Set<Persona> personas = new TreeSet<Persona>();
		
		Persona p1 = new Persona("juan", "perez", new Documento("DNI", 14785896), LocalDate.of(2001, 10, 8));
		Persona p2 = new Persona("ana", "lopez", new Documento("DNI", 25639854), LocalDate.of(2011, 12, 18));
		Persona p3 = new Persona("ana", "gutierrez", new Documento("DNI", 23578854), LocalDate.of(2021, 5, 8));
		
		personas.add(p1);
		personas.add(p2);
		personas.add(p3);
		
		Iterator<Persona> it = personas.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	}

}
