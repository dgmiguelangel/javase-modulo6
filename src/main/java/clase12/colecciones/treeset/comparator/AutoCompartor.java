package clase12.colecciones.treeset.comparator;

import java.util.Comparator;

public class AutoCompartor implements Comparator<Auto> {

	@Override
	public int compare(Auto o1, Auto o2) {
		return o1.getPatente().getNumero().compareTo(o2.getPatente().getNumero());
	}

}
