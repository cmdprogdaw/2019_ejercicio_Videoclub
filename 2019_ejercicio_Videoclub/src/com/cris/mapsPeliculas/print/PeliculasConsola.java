package com.cris.mapsPeliculas.print;

import java.util.Iterator;

import com.cris.mapsPeliculas.beans.Pelicula;


public class PeliculasConsola {
	
	/**
	 * Recibe un iterador de peliculas, lo recorre, saca la pelicula y la imprime
	 * @param datos
	 */
	public static void imprimir(Iterator<Pelicula> datos) {

		System.out.println("*******************");
		System.out.println("Peliculas disponibles");
		while(datos.hasNext()) { 
			
			Pelicula pelicula= datos.next();
			System.out.println(pelicula);
		}
		
	}
}
