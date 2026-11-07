package clase3;


public class EjemploConcatenacion {

    public static void main(String[] args) {
        var nombre = "Miguel";
        var titulo = "Docente";
        var union = titulo + " " + nombre;
        System.out.println("union = " + union);
        
        var a = 8;
        var b = 4;
        System.out.println(a + b); 
        System.out.println(nombre + a + b); // aqui como nombre es cadena, pues se considera que todo es cadena)
        
       
        System.out.println(nombre + (a + b));
    }
}
