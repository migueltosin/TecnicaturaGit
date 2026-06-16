import java.util.Scanner;

public class CalculadorTiempo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.class);
        
        // Constantes para la conversión
        final int HORAS_POR_DIA = 24;
        final int HORAS_POR_SEMANA = 24 * 7; // 168 horas
        
        System.out.print("Digite el número total de horas: ");
        int horasTotales = entrada.nextInt();
        
        // Cálculos utilizando división y residuo
        int semanas = horasTotales / HORAS_POR_SEMANA;
        int horasRestantes = horasTotales % HORAS_POR_SEMANA;
        
        int dias = horasRestantes / HORAS_POR_DIA;
        int horasFinales = horasRestantes % HORAS_POR_DIA;
        
        // Mostrar resultados
        System.out.println("\nEl equivalente es:");
        System.out.println(semanas + " semanas");
        System.out.println(dias + " días");
        System.out.println(horasFinales + " horas");
        
        entrada.close();
    }
}