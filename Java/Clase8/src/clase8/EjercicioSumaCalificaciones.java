import java.util.Scanner;

public class EjercicioSumaCalificaciones {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese la primera calificacion: ");
        float acumCalificaciones = Float.parseFloat(entrada.nextLine());
        System.out.print("Ingrese la segunda calificacion: ");
        acumCalificaciones += Float.parseFloat(entrada.nextLine());
        System.out.print("Ingrese la tercera calificacion: ");
        acumCalificaciones += Float.parseFloat(entrada.nextLine());
        System.out.println("Suma de las notas: " + acumCalificaciones);
    }
}
