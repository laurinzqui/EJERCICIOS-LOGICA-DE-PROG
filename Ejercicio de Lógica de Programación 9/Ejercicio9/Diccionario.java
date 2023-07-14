package Ejercicio9;
import java.util.HashMap;
import java.util.Scanner;

public class Diccionario {
    public static void main(String[] args) {
        // Crear el diccionario Español-Inglés utilizando un HashMap
        HashMap<String, String> diccionario = new HashMap<>();
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

        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario una palabra en español
        System.out.print("Ingrese una palabra en español: ");
        String palabra = scanner.nextLine();

        // Buscar la traducción en el diccionario y mostrarla
        String traduccion = diccionario.get(palabra);
        if (traduccion != null) {
            System.out.println("Traducción al inglés: " + traduccion);
        } else {
            System.out.println("La palabra no se encuentra en el diccionario");
        }
    }
}
