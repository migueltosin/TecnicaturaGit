
//Inferencia de tipos var y tipos primitivos
/*
public class EjemplosInferencias {

    public static void main(String[] args) {
        var numEntero = 20; // las literales sin punto automaticamente son de tipo int 
        System.out.println("numEntero = " + numEntero);
        var numFloar = 10.0F;   //  la F  especifica Float
        System.out.println("numFloar = " + numFloar);
        var numDouble = 10.0; // automaticamente infiere Double
        System.out.println("numDouble = " + numDouble);
    }
}

public class EjemploPrimitivoChar {

    public static void main(String[] args) {
        char miVariableChar = 'a';
        System.out.println("miVariableChar = " + miVariableChar);

        char miVariableCharUni = '\u0024'; // Indicamos a Java asignar con unicode
        System.out.println("miVariableCharUni = " + miVariableCharUni);

        char miVariableCharDecimal = 36; // Indicamos a Java asignar con unicode pero con valor decimal
        System.out.println("miVariableCharDecimal = " + miVariableCharDecimal);

        char miVariableCharEspecial = '$'; // Ponemos el caracter especial
        System.out.println("miVariableCharEspecial = " + miVariableCharEspecial);

        // Con inferencia de tipo
        var varInferCharUni = '\u0024';
        System.out.println("varInferCharUni = " + varInferCharUni);
        // var varInferCharDecimal = 36; // aqui no lo va a tomar como Char, va a inferir Int
        var varInferCharDecimal = (char) 36; // ahora si porque aclaramos
        System.out.println("varInferCharDecimal = " + varInferCharDecimal);
        var varInferSimbolo = '$';
        System.out.println("varInferSimbolo = " + varInferSimbolo);

        // de char a int es posible
        int charEspecialAInt = '$';
        System.out.println("charEspecialAInt = " + charEspecialAInt);
        int charAInt = 'b';
        System.out.println("charAInt = " + charAInt);
    }
}
