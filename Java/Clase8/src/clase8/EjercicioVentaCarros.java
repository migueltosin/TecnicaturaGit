import java.util.Scanner;

public class EjercicioVentaCarros {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        final float salarioBase = 1000;

        int carrosVendidos;
        float valorCarro, comisionPorCarros, comisionVentas, salarioTotal;

        System.out.println("Ingrese la cantidad de carros vendidos:");
        carrosVendidos = entrada.nextInt();

        System.out.println("Ingrese el valor total de las ventas:");
        valorCarro = entrada.nextFloat();

        // 150 por cada carro vendido
        comisionPorCarros = carrosVendidos * 150;

        // 5% del valor de ventas
        comisionVentas = valorCarro * 0.05f;

        // salario total
        salarioTotal = salarioBase + comisionPorCarros + comisionVentas;

        System.out.println("El salario mensual es: $" + salarioTotal);
    }
}