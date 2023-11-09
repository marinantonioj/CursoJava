/**
 * 
 */
package com.curso.sem1;

import java.util.List;

/**
 * @author Admin
 * @version 1.0.0
 * Nombre es el nombre del deporte.
 * nJugadores es el número de jugadores que juegan el partido.
 * jugadores es un array con los nombres de los jugadores que juegan el partido
 */
public abstract class Deporte {
	protected static final int MAX_JUGADORES = 22;//VARIABLE ESTÁTICA COMPARTIDA
	public final String PARTIDO = "Partido";//CONSTANTE DE INSTANCIA
	public String nombre;
	public int nJugadores;
	public List<String> jugadores;

	/**
	 * La función Juega, nos devolverá el nombre del deporte al que se esté jugando
	 * y el número de jugadores de ese deporte.
	 */
	public void Juega() {
		System.out.printf("Se está jugando a %s con %d jugadores\n", nombre, nJugadores);
	}
	
	/**
	 * Con ListarJugadores, obtendremos una lista con los nombres de los jugadores que
	 * participan en el partido.
	 */
	public void ListarJugadores() {
		System.out.println("Lista de jugadores: " + jugadores);
	}
	
	/**
	 * Se implementará en todas las clases que hereden de deporte para poder usar la
	 * variable estática compartida. Devolverá los puestos libres de inscripción que hay para 
	 * cada partido.
	 */
	public abstract void puestosLibres();
}
