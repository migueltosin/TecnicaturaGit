package C2_Ejercitacion;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Ejercicion2 {
    public static void main(String[] args) {
        // Ejercicio 2: Leer un numero e indicar si es positivo o negativo. Repetir el proceso
        // hasta que el numero sea igual a 0
        
        // Clase Scanner
        System.out.println("Clase Scanner");
        int num;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite un numero: ");
        num = entrada.nextInt();
        while (num != 0) {
            if (num > 0){
                System.out.println("Numero positivo: "+num);
            }
            else{
                System.out.println("Numero negativo: "+num);
            }
            System.out.println("Digite un numero: ");
            num = entrada.nextInt();
        }
        System.out.println("Fin del programa: el numero ingresado es igual a cero.");
        
        //Clase JOptionPane
        JOptionPane.showMessageDialog(null, "Clase JOptionPane");
        int num2;
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
        while(num2 != 0){
            if (num2 > 0){
                JOptionPane.showMessageDialog(null, "El numero "+num2+" es positivo");
            }
            else{
                JOptionPane.showMessageDialog(null, "El numero "+num2+" es negativo");
            }
            num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
        }
        JOptionPane.showMessageDialog(null, "Fin del programa: ha ingresado el numero cero");
    }
}
