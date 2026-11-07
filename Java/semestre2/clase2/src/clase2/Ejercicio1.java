package C2_Ejercitacion;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Ejercicio1 {
    public static void main(String[] args) {
        // Ejercicio 1 de ciclos: Leer un numero y calcular su cuadrado, repetir el proceso hast que se introduzca
        // un numero negativo
        Scanner entrada =  new Scanner(System.in);
        int num, cuadrado;
        System.out.println("Digite un numero: ");
        num = Integer.parseInt(entrada.nextLine());
        while (num >= 0){
            cuadrado = (int)Math.pow(num, 2);
            System.out.println("El cuadrado de "+num+" es: "+cuadrado);
            System.out.println("Digite un numero: ");
            num = Integer.parseInt(entrada.nextLine());
        }
        System.out.println("Fin del programa: ha ingresado un numero negativo.");
        
        // Clase JOptionPane
        int num2, cuadrado2;
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: ")); //La clase JOptionPane es de tipo str, es necesario hacer una conversion de tipo
        while (num2 >= 0){
            cuadrado2 = (int)Math.pow(num2, 2);
            System.out.println("El cuadrado de "+num2+" es: "+cuadrado2);
            num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
        }
        System.out.println("Fin del programa: ha ingresado un numero negativo.");
    }
}
