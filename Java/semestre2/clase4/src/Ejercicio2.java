package C4_Ejercitacion;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Ejercicio2 {
    public static void main(String[] args) {
        /*
         Ejercicio 2: Pedir numeros hasta que se introduzca un numero negativo
         y calcular la media
        */
        
        // Clase Scanner:
        int num;
        float media = 0, suma = 0, cant = 0;
        Scanner entrada = new Scanner(System.in);
        do{
            System.out.println("Digite un numero: ");
            num = entrada.nextInt();
            if (num < 0)
                break;
            cant++;
            suma += num;
            media = suma / cant;
        }while(true);
        System.out.println("Fin del programa: Ha ingresado un numero negativo");
        System.out.println("Media de los numeros introducidos: " + media);
        entrada.close();
        
        // ClaseJOptionPane
        int num2;
        float media2 = 0, suma2 = 0, cant2 = 0;
        do{
            num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero:"));
            if (num2 < 0)
                break;
            cant2++;
            suma2 += num2;
            media2 = suma2 / cant2;
        }while(true);
        JOptionPane.showMessageDialog(null, "Fin del programa: Ha ingresado un numero negativo");
        JOptionPane.showMessageDialog(null, "Media de los numeros introducidos: " + media2);
    }
}
