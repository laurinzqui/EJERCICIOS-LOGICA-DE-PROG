package Ejercicio6;
import java.util.Scanner;

public class TextoInvertido {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("Ingrese una palabra o frase: ");
		String texto = scanner.nextLine();
		
		String invertido = invertirTexto (texto);
		System.out.println("Texto invertido;" + invertido);
		
	}
	  public static String invertirTexto(String texto) {
	        StringBuilder sb = new StringBuilder();
	        for (int i = texto.length() - 1; i >= 0; i--) {
	            sb.append(texto.charAt(i));
	        }
	        return sb.toString();
	    }
	

}
