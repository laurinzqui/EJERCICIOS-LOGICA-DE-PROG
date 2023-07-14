package Ejercicio10;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class JuegoTraduccion {
    public static void main(String[] args) {
        // Crear el diccionario Español-Inglés utilizando un HashMap
        Map<String, String> diccionario = new HashMap<>();
        diccionario.put("gato", "cat");
        diccionario.put("perro", "dog");
        diccionario.put("casa", "house");
        diccionario.put("árbol", "tree");
        diccionario.put("coche", "car");
        diccionario.put("libro", "book");
        diccionario.put("lápiz", "pencil");
        diccionario.put("computadora", "computer");
        diccionario.put("sol", "sun");
        diccionario.put("luna", "moon");
        diccionario.put("mesa", "table");
        diccionario.put("silla", "chair");
        diccionario.put("manzana", "apple");
        diccionario.put("naranja", "orange");
        diccionario.put("plátano", "banana");
        diccionario.put("leche", "milk");
        diccionario.put("agua", "water");
        diccionario.put("comida", "food");
        diccionario.put("amigo", "friend");
        diccionario.put("juego", "game");

        // Escoger 5 palabras al azar del diccionario
        String[] palabrasAleatorias = obtenerPalabrasAleatorias(diccionario, 5);

        Scanner scanner = new Scanner(System.in);

        int respuestasCorrectas = 0;
        int respuestasIncorrectas = 0;

        // Pedir al usuario la traducción al inglés de cada palabra
        for (String palabra : palabrasAleatorias) {
            System.out.print("Traducción de \"" + palabra + "\": ");
            String respuesta = scanner.nextLine();

            if (validarRespuesta(diccionario, palabra, respuesta)) {
                System.out.println("¡Respuesta correcta!");
                respuestasCorrectas++;
            } else {
                System.out.println("Respuesta incorrecta. La traducción correcta es: " + diccionario.get(palabra));
                respuestasIncorrectas++;
            }
        }

        // Mostrar el resultado final
        System.out.println("Respuestas correctas: " + respuestasCorrectas);
        System.out.println("Respuestas incorrectas: " + respuestasIncorrectas);
    }

    public static String[] obtenerPalabrasAleatorias(Map<String, String> diccionario, int cantidad) {
        String[] palabrasAleatorias = new String[cantidad];
        Object[] palabrasArray = diccionario.keySet().toArray();

        for (int i = 0; i < cantidad; i++) {
            palabrasAleatorias[i] = (String) palabrasArray[(int) (Math.random() * palabrasArray.length)];
        }

        return palabrasAleatorias;
    }

    public static boolean validarRespuesta(Map<String, String> diccionario, String palabra, String respuesta) {
        return respuesta.equalsIgnoreCase(diccionario.get(palabra));
    }
}
