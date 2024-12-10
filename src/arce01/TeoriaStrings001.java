package arce01;

public class TeoriaStrings001 {
	public static void main(String[] args) {
		String cadena = "Buenos Dias";
		
		//asi detectamos el {char} que hay en el indice {2} de la String llamada cadena 
		char a = cadena.charAt(2);
		System.out.println(a);
		
		//con .length() y el nombre de la cadena se puede saber la longitud de la String 
		int longitud = cadena.length();
		System.out.println(longitud);
		
		//con .equals(String) se comparan ambas cadenas y si son equivalentes da true
		String cadenant = "Malas Tardes";
		boolean iguales = cadena.equals(cadenant);
		System.out.println(iguales);
		
		//con .indexOf(Char) devuelve la primera instancia donde aparece el carácter introducido
		int b = cadenant.indexOf("a");
		System.out.println(b);
	}
}
