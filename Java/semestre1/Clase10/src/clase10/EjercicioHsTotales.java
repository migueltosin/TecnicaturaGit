import java.util.Scanner;

public class EjercicioHsTotales {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int horasTotales, semanas, dias, horas;

        System.out.print("Ingrese el total de horas: ");
        horasTotales = entrada.nextInt();

        semanas = horasTotales / 168; // 7 * 24
        horasTotales %= 168;

        dias = horasTotales / 24;
        horas = horasTotales % 24;

        System.out.println("Semanas: " + semanas);
        System.out.println("Dias: " + dias);
        System.out.println("Horas: " + horas);
    }
}