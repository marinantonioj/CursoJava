/**
 * 
 */
package com.curso.sem1;

import java.util.Arrays;
import java.util.List;

/**
 * @author Admin
 *
 */
public class Principal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<String> nombres = Arrays.asList("Juan", "Pepe", "Manolo", "Jose", "Javier", "Antonio", "Manuel", "Alberto");
		List<String> nombres1 = Arrays.asList("Juan", "Pepe");
		
		Tenis tenis = new Tenis(1, "Tenis DH", 2, nombres1);
		Pingpong pingpong = new Pingpong("PingPong DH", nombres1);
		Futbol futbol = new Futbol("Fútbol 4v4", 8, nombres);
		
		tenis.Juega();
		tenis.ListarJugadores();
		tenis.puestosLibres();
		tenis.daRaquetazo();
		System.out.println("=====|=====");
		pingpong.Juega();
		pingpong.ListarJugadores();
		pingpong.puestosLibres();
		pingpong.daRaquetazo();
		System.out.println("=====|=====");
		futbol.Juega();
		futbol.ListarJugadores();
		futbol.puestosLibres();
		futbol.chuta("Juan");
	
	}

}
