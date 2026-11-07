
package clase7;

import java.util.Scanner;

// @author micki

public class EjercicioMayorDeDosNumeros {
     public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Ingrese dos numeros enteros");
        var num1 = Integer.parseInt(userInput.nextLine());
        var num2 = Integer.parseInt(userInput.nextLine());
        System.out.println("El numero mayor es: " + ((num1 > num2) ? num1 : (num2 > num1) ? num2 : "ambos son iguales!"));
    }
}

    

