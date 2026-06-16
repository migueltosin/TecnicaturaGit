package ejerciciorectangulo;

import java.util.Scanner;

public class EjercicioRectangulo {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite el alto del rectangulo: ");
        int alto = Integer.parseInt(entrada.nextLine());

        System.out.println("Digite el ancho del rectangulo: ");
        int ancho = Integer.parseInt(entrada.nextLine());

        int area = alto * ancho;
        int perimetro = (alto + ancho) * 2;

        System.out.println("El area del rectangulo es: " + area);
        System.out.println("El perimetro del rectangulo es: " + perimetro);
    }
}