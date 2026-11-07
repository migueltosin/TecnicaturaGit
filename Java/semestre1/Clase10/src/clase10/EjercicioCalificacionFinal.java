import java.util.Scanner;

public class EjercicioCalificacionFinal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double participacion, parcial1, parcial2, examenFinal;
        double notaFinal;

        System.out.print("Ingrese la nota de participacion: ");
        participacion = entrada.nextDouble();

        System.out.print("Ingrese la nota del primer parcial: ");
        parcial1 = entrada.nextDouble();

        System.out.print("Ingrese la nota del segundo parcial: ");
        parcial2 = entrada.nextDouble();

        System.out.print("Ingrese la nota del examen final: ");
        examenFinal = entrada.nextDouble();

        notaFinal = participacion * 0.10 +
                    parcial1 * 0.25 +
                    parcial2 * 0.25 +
                    examenFinal * 0.40;

        System.out.println("La calificacion final es: " + notaFinal);
    }
}
