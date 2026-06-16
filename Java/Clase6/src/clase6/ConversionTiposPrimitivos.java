
/*Clase 6 (Conversion de tipos primitivos y primitivos bool.


import java.util.Scanner;


public class ConversionTiposPrimitivos {

    public static void main(String[] args) {
        // conversion de tipos primitivos
        var edad = Integer.parseInt("20"); // si o si String
        System.out.println("edad = " + edad);
        
        // Lo mismo pero con Double
        var valorPi = Double.parseDouble("3.1416");
        System.out.println("valorPi = " + valorPi);
        
        // Ahora con Scanner
        var entrada = new Scanner(System.in);
        System.out.println("Ingrese su edad: ");
        edad = Integer.parseInt(entrada.nextLine());
        System.out.println("edad = " + edad);
        
        // Conversion de Int a String
        var edadTexto = String.valueOf(10);
        System.out.println("edadTexto = " + edadTexto);
        var fraseChar = "Programadores".charAt(0);
        System.out.println("fraseChar = " + fraseChar);
        fraseChar = "Programadores".charAt(12);
        System.out.println("fraseChar = " + fraseChar);
        
        System.out.println("Ingrese un caracter");
        fraseChar = entrada.nextLine().charAt(0);
        System.out.println("fraseChar = " + fraseChar);
    }
}
public class TipoPrimitivoBool {

    public static void main(String[] args) {
        boolean varBool = true;
        // var varBool = true; // o tambien usando inferencia
        System.out.println("varBool = " + varBool);
        
        if (varBool){
            System.out.println("La bandera es verde");
        }
        else {
            System.out.println("La bandera es roja");
        }
        
        // Algoritmo Eres mayor de edad?
        var edad = 30; // por defecto la literal se hace Int
        var adulto = edad >= 18;
        // o tambien 
        // if (edad >= 18) {
        if (adulto) {
            System.out.println("Eres mayor de edad");
        }
        else {
            System.out.println("Eres menor de edad");
        }
    }
}
