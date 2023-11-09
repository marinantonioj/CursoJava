package com.curso.sem1;

import java.util.List;

/**
 * @author Admin
 * @version 1.0.0
 * @see Deporte
 * @see DeporteDeRaqueta
 *
 */
public class Pingpong extends Deporte implements DeporteDeRaqueta {
	//Al pingpong siempre jugarán dos personas
	private final int N_JUGADORES_PINGPONG = 2;//CONSTANTE DE CLASE

	public Pingpong(String nombre, List<String> jugadores) {
		super.nombre = nombre;
		super.jugadores = jugadores;
		super.nJugadores = N_JUGADORES_PINGPONG;
	}
	
	/**
	 * Devulve: "Golpea la pelota de forma suave"
	 */
	@Override
	public void daRaquetazo() {
		System.out.println("Golpea la pelota de forma suave");

	}

	/**
	 * Devuelve los puestos libres de inscripción
	 */
	@Override
	public void puestosLibres() {
		System.out.printf("Hay %d puestos libres\n", MAX_JUGADORES - nJugadores);
		
	}

}
