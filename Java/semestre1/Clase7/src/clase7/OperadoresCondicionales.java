
public class OperadoresCondicionales {

    public static void main(String[] args) {
        // Clase 7 - Parte 2 - Video 5
        
        // Condicionales (AND, OR, NOT)
        // AND
        var valorA = 7;
        var valorMinimo = 0;
        var valorMaximo = 10;
        var respuesta = valorA >= valorMinimo && valorA <= valorMaximo;
        if (respuesta)
            System.out.println("Esta¡ dentro del rango");
        else
            System.out.println("Esta¡ fuera del rango");
        
        // OR
        var vacaciones = false;
        var diaLibre = false;
        if (vacaciones || diaLibre)
            System.out.println("Papa¡ puede asistir");
        else
            System.out.println("Papa¡ no puede asistir");
    }
}
