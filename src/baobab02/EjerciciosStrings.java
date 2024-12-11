package baobab02;

import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class EjerciciosStrings {
	//Ejercicio 1 
	//Escriba la función int contarCaracteresNoNumericos(String cadena) 
	//que recibe una cadena y devuelva cuántos caracteres no numéricos hay.
	static int contarCaractereresNoNumericos(String cadena) {
		String cadenaNumerica = "0123456789";
		int contador = cadena.length();
		for (int i = 0 ; i < cadena.length(); i++) {
			
			char charCadena = cadena.charAt(i);
			for (int j = 0; j < cadenaNumerica.length(); j++) {
				char charNumerico = cadenaNumerica.charAt(j);
				if (charCadena == charNumerico) {
					contador -= 1;
				}
			}
		}
		return contador;
	}
	
	//Ejercicio 2
	//Escriba la función boolean todosNumericos(String cadena) 
	//que nos dirá si la cadena contiene todos los caracteres numéricos o no.
	static boolean todosNumericos(String cadena) {
		boolean todosNumericos;
		String cadenaNumerica = "0123456789";
		String cadenaAuxiliar = "0123456789";
		char hole = 'a';
		for (int i = 0 ; i < cadena.length(); i++) {
			char charCadena = cadena.charAt(i);
			for (int j = 0; j < cadenaNumerica.length(); j++) {
				char charNumerico = cadenaNumerica.charAt(j);
				if (charCadena == charNumerico) {
					cadenaAuxiliar = cadenaAuxiliar.replace(charCadena, hole);
				}
			}
		}
		if (cadenaAuxiliar.equals("aaaaaaaaaa")) {
			todosNumericos = true;
		}
		else {
			todosNumericos = false;
		}
			
		return todosNumericos;
	}
	
	//Ejercicio 3
	//Escriba la función String eliminarVocales(String cadena)
	//que eliminará todas las vocales de la cadena.
	static String eliminarVocales(String cadena) {
		String sinVocales = "";
		String vocales = "aeiouAEIOU";
		boolean vocal;
		for (int i = 0; i < cadena.length(); i++) {
			vocal = false;
			char charCad = cadena.charAt(i);
			for (int j = 0; j < vocales.length(); j++) {
				char charVoc = vocales.charAt(j);
				if (charVoc == charCad) {
					vocal = true;
				}
			}
			if (!vocal) {
				sinVocales += charCad;
			}
		}
		return sinVocales;
	}
	
	//Ejercicio 4
	//Escriba la función int contarVocales(String palabra)
	//que devuelva el número de vocales de la cadena.
	static int contarVocales(String palabra) {
		String vocales = "aeiouAEIOU";
		int numeroVocales = 0;
		for (int i = 0 ; i < palabra.length(); i++) {
			char charCadena = palabra.charAt(i);
			for (int j = 0; j < vocales.length(); j++) {
				char charNumerico = vocales.charAt(j);
				if (charCadena == charNumerico) {
					numeroVocales += 1;
				}
			}
		}
		return numeroVocales;
	}
	
	/*Ejercicio 5
	Escriba la función String piedraPapelTijera(String jugada1, String jugada2)
	que reciba dos cadenas con una jugada “piedra”, “papel” o “tijera” y devuelva:
    a. "¡Gano el jugador 1!"
    b. "¡Gano el jugador 2!"
    c. "¡Empate!"
    */
	static String piedraPapelTijera(String jugada1, String jugada2) {
		jugada1 = jugada1.strip();
		jugada1 = jugada1.toLowerCase();
		jugada2 = jugada2.strip();
		jugada2 = jugada2.toLowerCase();
		String resultado;
		if (jugada1.equals(jugada2)) {
			resultado = "¡Empate!";
		}
		else {
			if (jugada1.equals("tijera")){
				if (jugada2.equals("piedra")) {
					resultado = "¡Gano el jugador 2!";
				} else {
					resultado = "¡Gano el jugador 1!";
				}
				
			} else if (jugada1.equals("piedra")) {
				if (jugada2.equals("tijera")) {
					resultado = "¡Gano el jugador 1!";	
				} else { 
					resultado = "¡Gano el jugador 2!";
				}
			} else {
				if (jugada2.equals("tijera")) {
					resultado = "¡Gano el jugador 2!";
				} else {
					resultado = "¡Gano el jugador 1!";	
				}
			}
		}
		return resultado;
	}
	
	//Ejercicio6
	//Escriba la función String cadenaDelReves(String cadena) 
	//que nos devuelva la cadena del revés.
	static String cadenaDelReves(String cadena) {
		String cadenaInv = "";
		for (int i = 0 ; i < cadena.length(); i++) {
			cadenaInv += cadena.charAt(cadena.length()-i-1);
		}
		return cadenaInv;
	}
	
	//Ejercicio7
	//Crea la función int puntuacionScrabble(String palabra) 
	//que devolverá la puntuación que tendría en el Scrabble:
	static int puntuacionScrabble(String palabra) {
		int totalPuntos = 0;
		palabra = palabra.toLowerCase();
		String [] arrayPuntos = {"aeioulnrst","dg","bcmp","fhvwy","k","jxñ","qz"};
		for (int i = 0; i < palabra.length(); i++) {
			char charLetra = palabra.charAt(i);
			for (int j = 0; j < arrayPuntos.length; j++) {
				String aux = arrayPuntos[j].toString();
				for (int k = 0; k < aux.length(); k++) {		
					char charPunto = aux.charAt(k);
					if (charLetra == charPunto) {
						if (j <= 4) {
							totalPuntos += j+1;
						} else if (j == 5) {
							totalPuntos += 8;
						} else {
							totalPuntos += 10;
						}
					}
				}
			}
		}
		return totalPuntos;
	}
	
	//Ejercicio8
	//Resuelve el horror de los teclados no estandarizados proporcionando la función String ordenadorAmovil(String numero)
	//que convierte la entrada del ordenador en un número como si estuviera escrito en un móvil.
	static String ordenadorAmovil(String numero) {
		String ordenMovil = "0123456789";
		String ordenPC = "0789456123";
		String ordenada = "";
		for (int i = 0; i < numero.length(); i++) {
			char charNumero = numero.charAt(i);
			for (int j = 0; j < ordenPC.length(); j++ ) {
				char charPC = ordenPC.charAt(j);
				if (charPC == charNumero) {
					ordenada += ordenMovil.charAt(j);
				}
			}
		}
		return ordenada;
	}
	
	//Ejercicio9
	//Escriba la función String [] ordenarAlfabeticamente(String [] palabras)
	//que recibe un array de palabras y debe devolver el array en orden alfabético ascendente.
	static String[] ordenarAlfabeticamente(String [] palabras) {
		int contador = 0;
		List<String> palabraLista = Arrays.<String>asList(palabras);
		String[] palabrasOrdenadas = new String[palabraLista.size()];
		Collections.sort(palabraLista);
		for (String palabra : palabraLista) {
			palabrasOrdenadas[contador] = palabra;
			contador += 1;
		}
		return palabrasOrdenadas;
	}
	
	//Ejercicio10
	//Escriba la función boolean capicua(int numero)
	//que devuelve si el número entero es capicúa o no
	
	static boolean capicua(int numero) {
		String cadena = Integer.toString(numero);
		boolean capi = false;
		for (int i = 0; i < cadena.length()/2; i++) {
			if (cadena.charAt(i) != cadena.charAt(cadena.length()-i-1)) {
				capi = false;
			} else {
				capi = true;
			}
		}
		return capi;
	}
	
	//Ejercicio11
	//Escriba la función boolean palindromo(String cadena)
	//que nos diga si es un palíndromo o no.
	
	static boolean palindromo(String cadena) {
		cadena = cadena.strip();
		cadena = cadena.toLowerCase();
		boolean capi = false;
		for (int i = 0; i < cadena.length(); i++) {
			if (cadena.charAt(i) != cadena.charAt(cadena.length()-i-1)) {
				capi = false;
			} else {
				capi = true;
			}
		}
		return capi;
	}
	public static void main(String[] args) {
		
		String cadena = "a b b  C c c bb a";

		String[] palabras = {"alce", "campeon", "boca"};
		
		int numero = 23132;
		
		int ejercicio01 = contarCaractereresNoNumericos(cadena);
		
		boolean ejercicio02 = todosNumericos(cadena);
		
		String ejercicio03 = eliminarVocales(cadena);
		
		int ejercicio04 = contarVocales(cadena);
		
		//Ejercicio5
		String jugada1 = "tijeras";
		String jugada2 = "papel";
		String ejercicio05 = piedraPapelTijera(jugada1, jugada2);
		
		String ejercicio06 = cadenaDelReves(cadena);
		
		int ejercicio07 = puntuacionScrabble(cadena);
		
		String ejercicio08 = ordenadorAmovil(cadena);
		
		String[] ejercicio09 = ordenarAlfabeticamente(palabras);
		for (String palabrita : ejercicio09) {
			//System.out.println(palabrita);
		}
		
		boolean ejercicio10 = capicua(numero);
		
		boolean ejercicio11 = palindromo(cadena);
		
		System.out.println(ejercicio11);
				
	}
}
