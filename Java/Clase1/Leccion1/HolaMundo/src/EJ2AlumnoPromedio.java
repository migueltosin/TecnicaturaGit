import java.util.Scanner;
/*Ejercicio 2: Determinar si un alumno aprueba o reprueba un curso, 
sabiendo que aprobará si su promedio de tres calificaciones es 
mayor o igual a 70; reprueba caso contrario*/

public class EJ2AlumnoPromedio {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double nota1, nota2, nota3, promedio;

        System.out.print("Ingrese la primera nota: ");
        nota1 = entrada.nextDouble();

        System.out.print("Ingrese la segunda nota: ");
        nota2 = entrada.nextDouble();

        System.out.print("Ingrese la tercera nota: ");
        nota3 = entrada.nextDouble();

        promedio = (nota1 + nota2 + nota3) / 3;

        if (promedio >= 70) {
            System.out.println("El alumno está aprobado con: " + promedio);
        } else {
            System.out.println("El alumno está desaprobado con: " + promedio);
        }

        entrada.close();
    }
}