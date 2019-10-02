package com.cris.mapsPeliculas.inicio;
import java.util.HashMap;
import java.util.Map;

import com.cris.mapsPeliculas.beans.Director;
import com.cris.mapsPeliculas.beans.Pelicula;
import com.cris.mapsPeliculas.negocio.Netflix;
import com.cris.mapsPeliculas.print.PeliculasConsola;

public class Start {

	public static void main(String[] args) {

		Director spilberg = new Director();
		spilberg.setNombre("Steven Spilberg");
		
		Director burton = new Director();
		burton.setNombre("Tim burton");
		
		
		Pelicula et = new Pelicula();
		et.setDirector(spilberg);
		et.setAnio(1982);
		et.setTitulo("E.T.");
		et.setPresupuesto(4567.34);
		
		Pelicula tiburon = new Pelicula();
		tiburon.setDirector(spilberg);
		tiburon.setAnio(1975);
		tiburon.setTitulo("Tiburón");
		tiburon.setPresupuesto(46567.34);
		
		
		
		Netflix baseDatosPeliculas = new Netflix();
		baseDatosPeliculas.addPelicula(et);
		baseDatosPeliculas.addPelicula(tiburon);
		
		
		PeliculasConsola.imprimir(baseDatosPeliculas.getPeliculas());
	}

}
