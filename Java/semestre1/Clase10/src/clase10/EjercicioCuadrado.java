import java.util.Scanner;

public class EjercicioCuadrado {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double a, b, resultado;

        System.out.print("Ingrese el valor de a: ");
        a = entrada.nextDouble();

        System.out.print("Ingrese el valor de b: ");
        b = entrada.nextDouble();

        resultado = Math.pow(a, 2) + Math.pow(b, 2) + (2 * a * b);

        System.out.println("El resultado de (a+b)^2 es: " + resultado);
    }
}