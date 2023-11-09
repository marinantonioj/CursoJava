/**
 * 
 */
package com.curso.sem1;

import java.util.List;

/**
 * @author Admin
 * @version 1.0.0
 * @see Deporte
 * @see DeporteDeRaqueta
 *
 */
public class Tenis extends Deporte implements DeporteDeRaqueta {

	public int tipoDeCampo;

	public Tenis(int tipoDeCampo, String nombre, int nJugadores, List<String> jugadores) {
		super.nombre = nombre;
		super.jugadores = jugadores;
		super.nJugadores = nJugadores;
		this.tipoDeCampo = tipoDeCampo;
	}


	/**
	 * Como se trata de Tenis, devuelve "Golpea la pelota con fuerza"
	 */
	@Override
	public void daRaquetazo() {
		System.out.println("Golpea la pelota con fuerza");

	}

	/**
	 * Devuelve los puestos libres de inscripción
	 */
	@Override
	public void puestosLibres() {
		System.out.printf("Hay %d puestos libres\n", MAX_JUGADORES - nJugadores);
		
	}
	
	

}
