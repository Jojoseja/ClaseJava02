package arce01;



public class EjercicioStrings001 {
	//Ejercicio 1: Dada una cadena, devolver el numero de vocales que tiene.
	static int numeroVocales(String cadena) {
		int numeroVocales = 0;
		cadena = cadena.toLowerCase();
		for (int i = 0; i < cadena.length(); i++) {
			char caracter =  cadena.charAt(i);
			if (caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u') {
				numeroVocales +=1;
			}
		}
		return numeroVocales;
	}
	
	//Ejercicio 2: Dada una cadena, invertirla
	static String invertirString(String cadena) {
		String cadenaInv = "";
		for (int i = 0 ; i < cadena.length(); i++) {
			cadenaInv += cadena.charAt(cadena.length()-i-1);
		}
		return cadenaInv;
	}
	
	//Ejercicio 3: Dada una String y un char, devolver el numero de veces que se repite char dentro de la String
	static int numeroCaracter(String cadena, char caracter) {
		int numeroCaracter = 0;
		for (int i = 0 ; i < cadena.length(); i++) {
			if (cadena.charAt(i) == caracter) {
				numeroCaracter += 1;
			}
		}
		return numeroCaracter;
	}
	
	public static void main(String[] args) {
		String cadena = "HOLA QUE TAL BUENOS DIAS";
		char caracter = 'A';
		//Test ej1
		int a = numeroVocales(cadena);
		System.out.println(a);
		//Test ej2
		String cadenaInv = invertirString(cadena);
		System.out.println(cadenaInv);
		//Test ej3
		int ej3 = numeroCaracter(cadena, caracter);
		System.out.println(ej3);
	}
}
