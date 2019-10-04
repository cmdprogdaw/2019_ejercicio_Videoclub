package com.cris.mapsPeliculas.negocio;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

import com.cris.mapsPeliculas.beans.Director;
import com.cris.mapsPeliculas.beans.Pelicula;
import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;

public class Netflix {

	
	private HashMap<String,Pelicula> peliculasTitulo;
	private HashMap<Director,ArrayList<Pelicula>> peliculasDirector;
	private HashMap<Integer,Pelicula> peliculasAnio;
	
	
	
	//constructor
	public Netflix() {
		
		peliculasTitulo = new HashMap<String,Pelicula>();
		peliculasDirector = new HashMap<Director,ArrayList<Pelicula>>();
		peliculasAnio = new HashMap<Integer,Pelicula>();
	}
	
	
	
	/**
	 * Añade a la base de datos peliculas para su busqueda mas eficiente
	 * @param pelicula
	 */
	public void addPelicula(Pelicula pelicula) {
		
		peliculasTitulo.put(pelicula.getTitulo(), pelicula);
		peliculasAnio.put(pelicula.getAnio(), pelicula);
		
		//peliculasDirector.put(pelicula.getDirector(), pelicula);
		
		/*cuando yo pretendo añadir, si la clave con el director ya tiene una entrada 
		 *tengo que acceder a su lista de peliculas para añadir
		 *y si no hay nada tengo que crear la lista de peliculas
		 */
		
		if(peliculasDirector.containsKey(pelicula.getDirector())) {
			//extraer la lista de peliculas
			ArrayList<Pelicula> lista = peliculasDirector.get(pelicula.getDirector());
			
			//añadir la nueva pelicula
			lista.add(pelicula);
		}
		else {
			//crear una nueva lista de peliculas
			ArrayList<Pelicula> lista = new ArrayList<Pelicula>();
			lista.add(pelicula);
			
			//colocarla en el HashMap
			peliculasDirector.put(pelicula.getDirector(), lista);
		}
	}
	
	
	
	
	/**
	 * Busca y devuelve si existe una pelicula por su titulo
	 * @param titulo parametro de busqueda
	 * @return la Pelicula o null
	 */
	public Pelicula getPelicula(String titulo) {
		
		return peliculasTitulo.get(titulo);
	}
	
	
	
	/**
	 * Busca y devuelve si existe una pelicula por su año
	 * @param anio parametro de busqueda
	 * @return la Pelicula o null
	 */
	public Pelicula getPelicula(int anio) {
		
		return peliculasAnio.get(anio);
	}
	
	
	
	/**
	 * Busca y devuelve si existe una pelicula por su director
	 * @param director parametro de busqueda
	 * @return la Pelicula o null
	 */
	public void getPeliculas() {
		/*
		return peliculasDirector.get(director).iterator();
		*/
		
		for(Director key : peliculasDirector.keySet()) {
			
			List<Pelicula> list = peliculasDirector.get(key);
			System.out.println(list);
		}
	}
	
	
	/*
	public Iterator<Pelicula> getPeliculas(){
		
		return peliculasAnio.values().iterator();
	}
	*/
}
