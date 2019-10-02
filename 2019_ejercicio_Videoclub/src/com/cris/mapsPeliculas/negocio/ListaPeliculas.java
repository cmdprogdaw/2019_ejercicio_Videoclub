package com.cris.mapsPeliculas.negocio;

import java.util.ArrayList;
import java.util.Iterator;

import com.cris.mapsPeliculas.beans.Pelicula;

public class ListaPeliculas {

	
	private ArrayList<Pelicula> lista;
	
	
	public ListaPeliculas() {
		
		lista = new ArrayList<Pelicula>();
	}
	
	
	public Iterator<Pelicula> getPersonas() {
		
		return lista.iterator();
	}
}
