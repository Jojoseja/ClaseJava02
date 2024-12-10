package arce01;

public class TeoriaStrings002 {
	public static void main(String[] args) {
		
		//Concatenar Strings -> Se hace con el operador +, no sirve para operar
		String cadena1 = "10";
		String cadena2 = "20";
		String cadena3 = cadena1 + cadena2;
		System.out.println(cadena3);
		
		//Caracteres de "ayuda", para evitar que java los "lea, se usa la barra invertida \"
		String cadena4 = "Se hacen llamar \"Vikingos\"";
		System.out.println(cadena4);
	}
}
