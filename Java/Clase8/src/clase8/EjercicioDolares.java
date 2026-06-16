
import java.util.Scanner;

public class EjercicioDolares {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese los dolares de Guillermo: $");
        float guillermoDolares = Float.parseFloat(entrada.nextLine());
        var luisDolares = guillermoDolares / 2;
        var juanDolares = (guillermoDolares + luisDolares) / 2;
        var sumaTotal = guillermoDolares + luisDolares + juanDolares;
        System.out.println("Luis (mitad de Guille): $" + luisDolares + "\nJuan (mitad de los dos): $" + juanDolares + "\nSuma total: $" + sumaTotal);
    }

}
