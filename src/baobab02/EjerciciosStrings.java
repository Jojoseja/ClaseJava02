package baobab02;
import java.util.Scanner;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;



public class EjerciciosStrings {
	
	static Scanner sc = new Scanner(System.in);
	
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
		jugada1 = jugada1.trim();
		jugada1 = jugada1.toLowerCase();
		jugada2 = jugada2.trim();
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
	
	
	//Ejercicio12
	//Escriba la función String palabraMasLarga(String [] palabras)
	//que devuelve la palabra de mayor longitud.
	static String palabraMasLarga(String[] palabras) {
		String palabraLarga = "";
		int longitudPalabra;
		int maxPalabra = 0;
		for (int i = 0; i < palabras.length; i++) {
			longitudPalabra = palabras[i].length();
			if (longitudPalabra > maxPalabra) {
				maxPalabra = longitudPalabra;
				palabraLarga = palabras[i];
			} 
		}
		return palabraLarga;
	}
	
	//Ejercicio13
	static void gestionarTareas() {
		boolean menu = true;
		String[] tareas = new String[10];
		do {
			System.out.println("1.-Introducir tarea.\r\n"
					+ "2.-Listar tareas.\r\n"
					+ "3.-Eliminar tarea.\r\n"
					+ "4.-Eliminar todas las tareas.\r\n"
					+ "5.-Salir.\r\n");
			int opcion = sc.nextInt();
			switch(opcion) {
			case 1:
				if (tareas.length>10) {
					System.out.println("Máximo de tareas (10");
				} else {
					System.out.println("Introduce la tarea: ");
					String tarea = sc.next();
					for (int i = 0; i < tareas.length; i++) {
						if (tareas[i] == null){
							String guia = Integer.toString(i+1);
							tareas[i] = guia + ".-" + tarea;
							break;
						}
					}
				}
				break;
			case 2:
				for (String tarea : tareas) {
					if (tarea != null) {
						System.out.println(tarea);
						}
				}
				break;
			case 3:
				for (String tarea : tareas) {
					if (tarea != null) {
						System.out.println(tarea);
						}
				}
				System.out.println("Selecciona la tarea que quieras borrar");
				int borrar = sc.nextInt();
				tareas[borrar-1] = null;
				break;
			case 4:
				tareas = new String[10];
				break;
			case 5:
				System.out.println("Adios !");
				menu = false;
				break;
			default:
				System.out.println("Introduce un valor correcto");
			}
		}
		while (menu);
	}
	
	//Ejercicio14
	//Escriba la función String unirCadena(String cad1, String cad2).
	//Devolverá las dos palabras entrelazadas, empezando por la primera.
	static String unirCadena(String cad1, String cad2) {
		String cadenaCompleta = cad1 + cad2;
		return cadenaCompleta;
	}
	
	//Ejercicio15
	//Escriba la función String obtenerNIF(int dni) que recibe un número de DNI (entero largo sin signo)
	//y retorna un string con el número acompañado de su correspondiente letra de NIF 
	//(para la obtención de la letra se utiliza el string “TRWAGMYFPDXBNJZSQVHLCKE”, 
	//cogiendo la letra que ocupa la posición igual al resto de  dividir el número de DNI por 23).  
	static String obtenerNIF(int DNI) {
		String resto = "TRWAGMYFPDXBNJZSQVHLCKE";
		int restoNum = DNI % 23;
		char letra = resto.charAt(restoNum);
		String letraS = "";
		letraS += letra;
		String NIF = Integer.toString(DNI) + letra;
		return NIF;
	}
	
	//Ejercicio16
	//Escriba la función boolean esValidoNIF(String nif)
	//que recibe un NIF y retorna si es válido (tiene entre 7 u 8 números consecutivos y la letra correspondiente.
	static boolean esValidoNIF (String nif) {
		boolean valido;
		String resto = "TRWAGMYFPDXBNJZSQVHLCKE";
		char letra = nif.charAt(nif.length()-1);
		String numero = "";
		for (int i = 0; i < nif.length()-1; i++) {
			numero += nif.charAt(i);
		}
		int DNI = Integer.valueOf(numero);
		int div = DNI % 23;
		if (letra != resto.charAt(div)) {
			valido = false;
		} else {
			valido = true;
		}
		return valido;
	}	
	
	//Ejercicio17
	//Escriba la función String parrafoMayusculas(String parrafo) Recibe un string con un párrafo 
	//y retorna otro con la misma frase en la que la primera letra de  todas sus palabras está en mayúscula.
	static String parrafoMayusculas(String parrafo) {
		String parrafoCorregido = "";
		parrafo = parrafo.toLowerCase();
		boolean espacio = true;
		for (int i = 0; i < parrafo.length(); i++) {
			char letra = parrafo.charAt(i);
			if (espacio) {
				letra = Character.toUpperCase(letra);
				parrafoCorregido += letra;
				espacio = false;
			} else {
				parrafoCorregido += letra;
			}
			if (Character.isWhitespace(letra))
				espacio = true;
			
			
		}
		return parrafoCorregido;
		
	}
	
	//Ejercicio18
	static String cifrarCesar(String cadena, int codigo) {
		String abc = "abcdefghijklmnñopqrstuvwxyz";
		String cifrado = "";
		boolean upperCase = false;
		boolean letrita = false;
		for (int i = 0; i < cadena.length(); i++) {
			char letra = cadena.charAt(i);
			if (Character.isLetter(letra)) {
				letrita = true;
				if (Character.isUpperCase(letra)) {
					upperCase = true;
					letra = Character.toLowerCase(letra);
				} else {
				upperCase = false;
				}
			} else {
				cifrado += letra;
			}
			if (letrita){
				int index = abc.indexOf(letra);
				int nuevoIndex = (index+codigo)%abc.length();
				char nuevoChar = abc.charAt(nuevoIndex);
				if (upperCase) {
					nuevoChar = Character.toUpperCase(nuevoChar);
					cifrado += nuevoChar;
				} else {
					cifrado += nuevoChar;
				}
				letrita = false;
			}
			
		}
		return cifrado;
	}
	
	//Ejercicio19
	static void ahorcado(String palabra) {
		int vidas = 3;
		palabra = palabra.toLowerCase();
		String abc = "abcdefghijklmnñopqrstuvwxyz";
		String cifrada = "";
		for (int i = 0; i <palabra.length(); i++) {
			cifrada += "_";
		}
		boolean juego = true;
		do {
			System.out.println("Introduce una Letra");
			String letra = sc.nextLine();
			if (letra.length() == 1) {
				if(letra.indexOf(palabra) == -1 ) {
					System.out.println("No está la letra" + letra);
					vidas -=1;
				} else {
					for (int j= 0; j < palabra.length(); j++) {
						if (letra.charAt[0] == palabra.charAt(j)) {
							
						}
					}
				}
			} else {
				System.out.println("Introduce solo una letra");
			}
			System.out.println(cifrada);
			if (vidas == 0) {
				juego = false;
			}
		} while (juego);
	}
	
	public static void main(String[] args) {
		
		String cadena = "alce";

		String[] palabras = {"esternocleidomastoideo", "campeon", "boca"};
		
		int numero = 23132;
		
		//int ejercicio01 = contarCaractereresNoNumericos(cadena);
		
		//boolean ejercicio02 = todosNumericos(cadena);
		
		//String ejercicio03 = eliminarVocales(cadena);
		
		//int ejercicio04 = contarVocales(cadena);
		
		//Ejercicio5
		String jugada1 = "tijeras";
		String jugada2 = "tijeras";
		//String ejercicio05 = piedraPapelTijera(jugada1, jugada2);
		//System.out.println(ejercicio05);
		
		//String ejercicio06 = cadenaDelReves(cadena);
		
		//int ejercicio07 = puntuacionScrabble(cadena);
		
		//String ejercicio08 = ordenadorAmovil(cadena);
		
		//String[] ejercicio09 = ordenarAlfabeticamente(palabras);
		//for (String palabrita : ejercicio09) {
			//System.out.println(palabrita);}
		
		//boolean ejercicio10 = capicua(numero);
		
		//boolean ejercicio11 = palindromo(cadena);
		
		//String ejercicio12 = palabraMasLarga(palabras);
		
		//gestionarTareas();
		String cadena1 = "Hola";
		//String ejercicio14 = unirCadena(cadena, cadena1);
		
		int DNI = 51522213;
		String NIF = "51522213M";
		//String ejercicio15 = obtenerNIF(DNI);
		
		//boolean ejercicio16 = esValidoNIF(NIF);
		
		String parrafo = "hola buenos dias";
		
		//String ejercicio17 = parrafoMayusculas(parrafo);
		
		//String ejercicio18 = cifrarCesar("Hw wx, Euxwh?", -3);
		//System.out.println(ejercicio19);
				
	}
}
