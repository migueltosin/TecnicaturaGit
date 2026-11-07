/*
Ejercicio 8: Pedir un número N, y mostrar todos los números
del 1 al N.

Este programa permite elegir entre Scanner o JOptionPane
para ingresar el valor de N, mediante un menú inicial.
*/

package Ciclos08;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Ciclos08 {

    public static void main(String[] args) {

        // Menú de selección de método (usamos JOptionPane para el menú en sí)
        String[] opciones = {"Scanner", "JOptionPane"};
        int opcion = JOptionPane.showOptionDialog(
                null,
                "¿Con qué método querés ingresar el número N?",
                "Ejercicio 8 - Ciclos",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                opciones,
                opciones[0]
        );

        // Si el usuario cierra el menú sin elegir, se termina el programa
        if (opcion == JOptionPane.CLOSED_OPTION) {
            System.out.println("No se seleccionó ninguna opción. Fin del programa.");
            return;
        }

        int n;

        if (opcion == 0) {
            // ----- Método con Scanner -----
            Scanner teclado = new Scanner(System.in);
            System.out.print("Ingrese un número N: ");
            n = teclado.nextInt();

            System.out.println("Números del 1 al " + n + ":");
            for (int i = 1; i <= n; i++) {
                System.out.println(i);
            }

            teclado.close();

        } else {
            // ----- Método con JOptionPane -----
            String entrada = JOptionPane.showInputDialog(null, "Ingrese un número N:");
            n = Integer.parseInt(entrada);

            // Armamos el resultado como texto para mostrarlo en una sola ventana
            StringBuilder resultado = new StringBuilder();
            resultado.append("Números del 1 al ").append(n).append(":\n");
            for (int i = 1; i <= n; i++) {
                resultado.append(i).append("\n");
            }

            JOptionPane.showMessageDialog(null, resultado.toString());
        }
    }
}