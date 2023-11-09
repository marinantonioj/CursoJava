package com.curso.sem1;

import java.util.List;
import java.util.Random;

/**
 * @author Admin
 * @version 1.0.0
 * @see Deporte
 *
 */
public class Futbol extends Deporte {

	public Futbol(String nombre, int nJugadores, List<String> jugadores) {
		super.nombre = nombre;
		super.nJugadores = nJugadores;
		super.jugadores = jugadores;
	}
	/**
	 * La función recibe el nombre de un jugador. Al ejecutarse, decidirá aleatoriamente
	 * si marca gol o no y lo mostrará por pantalla.
	 * @param s
	 */
	public void chuta(String s) {
		String gol = marcaAleatorio();
		System.out.printf("%s %s ha marcado", s, gol);
	}
	
	/**
	 * 
	 * @return Devuelve aleatoriamente un "si" o un "no"
	 */
	private String marcaAleatorio() {
		String ret = "no";
		Random randomNum = new Random();
		int num = randomNum.nextInt(1);
		if(num == 1) {
			ret = "si";
		}
		return ret;
	}
	/**
	 * Devuelve los puestos libres de inscripción.
	 */
	@Override
	public void puestosLibres() {
		System.out.printf("Hay %d puestos libres\n", MAX_JUGADORES - nJugadores);
		
	}
	
}
