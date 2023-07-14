package ejercicio7;
import java.util.Scanner;

public class CalculoMinutosFinSemana {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar el día de la semana al usuario
        String diaSemana;
        do {
            System.out.print("Ingrese un día de la semana (Lunes - Viernes): ");
            diaSemana = scanner.nextLine();
        } while (!esDiaSemanaValido(diaSemana));

        // Solicitar la hora al usuario
        int horas;
        int minutos;
        do {
            System.out.print("Ingrese la hora (horas y minutos): ");
            String hora = scanner.nextLine();
            horas = obtenerHoras(hora);
            minutos = obtenerMinutos(hora);
        } while (!esHoraValida(horas, minutos));

        // Calcular los minutos faltantes para el fin de semana
        int minutosFaltantes = calcularMinutosFaltantes(diaSemana, horas, minutos);

        // Mostrar el resultado
        System.out.println("Faltan " + minutosFaltantes + " minutos para el fin de semana");
    }

    public static boolean esDiaSemanaValido(String diaSemana) {
        return diaSemana.equalsIgnoreCase("lunes") ||
                diaSemana.equalsIgnoreCase("martes") ||
                diaSemana.equalsIgnoreCase("miércoles") ||
                diaSemana.equalsIgnoreCase("miercoles") ||
                diaSemana.equalsIgnoreCase("jueves") ||
                diaSemana.equalsIgnoreCase("viernes");
    }

    public static boolean esHoraValida(int horas, int minutos) {
        return horas >= 0 && horas < 24 && minutos >= 0 && minutos < 60;
    }

    public static int obtenerHoras(String hora) {
        String[] partes = hora.split(":");
        if (partes.length > 0) {
            try {
                return Integer.parseInt(partes[0]);
            } catch (NumberFormatException e) {
                // Ignorar y retornar el valor por defecto (0)
            }
        }
        return 0;
    }

    public static int obtenerMinutos(String hora) {
        String[] partes = hora.split(":");
        if (partes.length > 1) {
            try {
                return Integer.parseInt(partes[1]);
            } catch (NumberFormatException e) {
                // Ignorar y retornar el valor por defecto (0)
            }
        }
        return 0;
    }

    public static int calcularMinutosFaltantes(String diaSemana, int horas, int minutos) {
        int minutosActuales = horas * 60 + minutos;
        int minutosFinSemana = 15 * 60; // Viernes a las 15:00 hrs
        int minutosDiaSemana = 24 * 60;

        int minutosRestantes;
        switch (diaSemana.toLowerCase()) {
            case "lunes":
                minutosRestantes = minutosDiaSemana - minutosActuales + minutosFinSemana;
                break;
            case "martes":
                minutosRestantes = minutosDiaSemana * 2 - minutosActuales + minutosFinSemana;
                break;
            case "miércoles":
            case "miercoles":
                minutosRestantes = minutosDiaSemana * 3 - minutosActuales + minutosFinSemana;
                break;
            case "jueves":
                minutosRestantes = minutosDiaSemana * 4 - minutosActuales + minutosFinSemana;
                break;
            case "viernes":
                minutosRestantes = minutosFinSemana - minutosActuales;
                break;
            default:
                minutosRestantes = 0; // Valor por defecto si no se reconoce el día de la semana
                break;
        }

        return minutosRestantes;
    }
}
