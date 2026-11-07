package C1_Practica;

public class clase1 {

    public static void main(String[] args) {
        //Ciclos y palabras reservadas de java
        
        // Ciclo while
        var conteo = 0;
        while (conteo < 6) {
            System.out.println("conteo = " + conteo);
            conteo++;
        }
        // Ciclo do while
        var contador = 0;
        do {
            System.out.println("contador = " + contador);
            contador++;
        } while (contador < 6);

        // Ciclo for
        for (int i = 0; i < 6; i++) {
            System.out.println("contador del ciclo for = " + i);
        }

        // Palabra reservada break
        for (int i = 0; i < 6; i++) {
            if (i % 2 == 0) {
                System.out.println("ciclo for = " + i);
                break;
            }
        }

        // Palabra reservada continue
        for (int i = 0; i < 6; i++) {
            if (i % 2 != 0) {
                continue;
            }
            System.out.println("ciclo for = " + i);
        }

        // Etiquetas Labels
        inicio:
        for (int i = 0; i < 6; i++) {
            if (i % 2 == 0) {
                System.out.println("ciclo for = " + i);
                break inicio;
            }
        }
    }
}