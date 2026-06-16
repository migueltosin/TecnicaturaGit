
package clase7;

public class Clase7 { //video1 - Operadores Aritmeticos
    

  
    public static void main(String[] args) {
 int num1 = 5, num2 = 4;
 var solucion = num1 + num2;
 System.out.println("solucion suma = " + solucion);
        
        solucion = num1 - num2;
        System.out.println("solucion resta = " + solucion);
        
        solucion = num1 * num2;
        System.out.println("solucion multiplicacion = " + solucion);
        
        solucion = num1 / num2;
        System.out.println("solucion division = " + solucion);
        
        var solucion2 = 3.4 / num2;
        System.out.println("solucion2 division = " + solucion2);
        
        solucion = num1 % num2;
        System.out.println("solucion modulo = " + solucion);
        
        if (num1 % 2 == 0) // "No hace falta las llaves {}?" No porque dentro de los bloques solo hay 1 linea
            System.out.println("Es un numero par");
        else
            System.out.println("Es un numero impar");
    }
}
 