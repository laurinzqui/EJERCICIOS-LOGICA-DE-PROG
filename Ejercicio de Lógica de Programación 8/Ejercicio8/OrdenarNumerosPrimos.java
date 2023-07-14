package Ejercicio8;
import java.util.*;

public class OrdenarNumerosPrimos{
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
			// Solicitar al usuario 10 números y almacenarlos en un array
			int[] numeros = new int[10];
			for (int i = 0; i < numeros.length; i++) {
			    System.out.print("Ingrese un número: ");
			    numeros[i] = scanner.nextInt();
			}

			// Ordenar los números primos al inicio del array
			ordenarNumerosPrimos(numeros);

			// Mostrar el array resultante
			mostrarArray(numeros);
		}
    }

    public static void ordenarNumerosPrimos(int[] numeros) {
        int indicePrimos = 0;

        for (int i = 0; i < numeros.length; i++) {
            if (esPrimo(numeros[i])) {
                int temp = numeros[indicePrimos];
                numeros[indicePrimos] = numeros[i];
                numeros[i] = temp;
                indicePrimos++;
            }
        }
    }

    public static boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void mostrarArray(int[] array) {
        System.out.println("Array ordenado:");
        for (int i = 0; i < array.length; i++) {
            System.out.println("pos[" + i + "] = " + array[i]);
        }
    }
}
