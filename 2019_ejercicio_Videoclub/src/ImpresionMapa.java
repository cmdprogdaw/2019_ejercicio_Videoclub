import java.util.HashMap;
import java.util.Iterator;

public class ImpresionMapa {
	
	public void imprimirMapa(HashMap<String, Pelicula> map) {
		Iterator<String> i = map.keySet().iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	}
}
