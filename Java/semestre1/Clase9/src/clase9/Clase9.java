/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase9;

import java.util.Scanner;


public class Clase9 {
/*
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese el mes: ");
        var mes = entrada.nextInt();
        if (1 <= mes && mes <= 3) {
            System.out.println("Verano");
        } else if (4 <= mes && mes <= 6) {
            System.out.println("OtoÃ±o");
        } else if (7 <= mes && mes <= 9) {
            System.out.println("Invierno");
        } else if (10 <= mes && mes <= 12) {
            System.out.println("Primavera");
        } else {
            System.out.println("Mes invalido");
        }
    }
}

   */
    //Ejercicio año switch
    /*
    Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese el mes: ");
        var mes = entrada.nextInt();
        switch (mes) {
            case 1: case 2: case 3:
                System.out.println("Verano");
                break;
            case 4: case 5: case 6:
                System.out.println("OtoÃ±o");
                break;
            case 7: case 8: case 9:
                System.out.println("Invierno");
                break;
            case 10: case 11: case 12:
                System.out.println("Primavera");
                break;
            default:
                System.out.println("Mes invalido");
        }
    }
}
*/
    /*
     public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese la calificacion: ");
        var cali = entrada.nextInt();
        
        if (9 <= cali && cali <= 10) {
            System.out.println("A");
        } else if (8 <= cali && cali < 9) {
            System.out.println("B");
        } else if (7 <= cali && cali < 8) {
            System.out.println("C");
        } else if (6 <= cali && cali < 7) {
            System.out.println("D");
        } else if (0 <= cali && cali < 6) {
            System.out.println("F");
        } else {
            System.out.println("Calificacion invalida");
        }
        
        switch (cali) {
            case 9: case 10:
                System.out.println("A");
                break;
            case 8:
                System.out.println("B");
                break;
            case 7:
                System.out.println("C");
                break;
            case 6:
                System.out.println("D");
                break;
            case 5: case 4: case 3: case 2: case 1: case 0:
                System.out.println("F");
                break;
            default:
                System.out.println("Calificacion invalida");
        }
    }

}
*/
    //Estructura if/Else
    /*
    var condicion = true;
        if (condicion) {
            System.out.println("Verdadero");
        } else {
            System.out.println("Falso");
        }
        
        var numero = 2;
        var numeroTexto = "Numero desconocido";
        if (numero == 1) {
            numeroTexto = "Numero uno";
        } else if (numero == 2) {
            numeroTexto = "Numero dos";
        } else if (numero == 3) {
            numeroTexto = "Numero tres";
        } else if (numero == 4) {
            numeroTexto = "Numero cuatro";
        } else {
            numeroTexto = "Numero no encontrado";
        }
        System.out.println("numeroTexto = " + numeroTexto);
    }
}

*/
    /*
    //Estructura Switch
    var numero = 2;
        switch (numero) {
            case 1:
                System.out.println("Num 1");
                break;
            case 2:
                System.out.println("Num 2");
                break;
            case 3:
                System.out.println("Num 3");
                break;
            default:
                System.out.println("Num invalido");
        }
    }
}

    
