import java.util.HashMap;
import java.util.Map;

public class Start {

	public static void main(String[] args) {


		Pelicula pelicula1 = new Pelicula();
		pelicula1.setTitulo("Coraline");
		pelicula1.setDirector("Tim Burton");
		pelicula1.setA�o(2009);
		
		Pelicula pelicula2 = new Pelicula();
		pelicula2.setTitulo("Los invencibles");
		pelicula2.setDirector("Anna Charles");
		pelicula2.setA�o(2010);
		
		Pelicula pelicula3 = new Pelicula();
		pelicula3.setTitulo("Your name");
		pelicula3.setDirector("Cristina Megido");
		pelicula3.setA�o(2018);
		
		Pelicula pelicula4 = new Pelicula();
		pelicula4.setTitulo("Red buttom");
		pelicula4.setDirector("James Smith");
		pelicula4.setA�o(2013);
		
		
		HashMap<String, Pelicula> datos = new HashMap<String, Pelicula>();
		
		datos.put(pelicula1.getTitulo(), pelicula1);
		datos.put(pelicula2.getTitulo(), pelicula2);
		datos.put(pelicula3.getTitulo(), pelicula3);
		datos.put(pelicula4.getTitulo(), pelicula4);
		
		ImpresionMapa imprimir = new ImpresionMapa();
		imprimir.imprimirMapa(datos);

	}

}
