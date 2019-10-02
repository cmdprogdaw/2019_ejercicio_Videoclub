package com.cris.mapsPeliculas.negocio;
import java.util.HashMap;
import java.util.Iterator;

import com.cris.mapsPeliculas.beans.Director;
import com.cris.mapsPeliculas.beans.Pelicula;

public class Netflix {

	
	private HashMap<String,Pelicula> peliculasTitulo;
	private HashMap<Director,Pelicula> peliculasDirector;
	private HashMap<Integer,Pelicula> peliculasAnio;
	
	
	
	//constructor
	public Netflix() {
		
		peliculasTitulo = new HashMap<String,Pelicula>();
		peliculasDirector = new HashMap<Director,Pelicula>();
		peliculasAnio = new HashMap<Integer,Pelicula>();
	}
	
	
	
	/**
	 * Añade a la base de datos peliculas para su busqueda mas eficiente
	 * @param pelicula
	 */
	public void addPelicula(Pelicula pelicula) {
		
		peliculasTitulo.put(pelicula.getTitulo(), pelicula);
		peliculasDirector.put(pelicula.getDirector(), pelicula);
		peliculasAnio.put(pelicula.getAnio(), pelicula);
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
	public Pelicula getPelicula(Director director) {
		
		return peliculasDirector.get(director);
	}
	
	
	
	public Iterator<Pelicula> getPeliculas(){
		
		return peliculasAnio.values().iterator();
	}
}
