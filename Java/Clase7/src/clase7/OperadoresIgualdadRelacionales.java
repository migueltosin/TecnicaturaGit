public class OperadoresIgualdadRelacionales {

    public static void main(String[] args) {
       
        
        var aNum = 5;
        var bNum = 4;
        var cNum = aNum == bNum;
        // var cNum = (aNum == bNum); // puede llevar parentesis o no
        System.out.println("cNum = " + cNum);
        
        var dNum = aNum != bNum;
        System.out.println("dNum = " + dNum);
        
        var cadenaA = "Hello"; // por defecto java infiere String
        var cadenaB = "Bye";
        var cVar = cadenaA == cadenaB; // no esta comparando contenidos ("Hello") esta comparando Referencias
        System.out.println("cVar = " + cVar);
        
        var fVar = cadenaA.equals(cadenaB);
        System.out.println("fVar = " + fVar);
        
          // Relacionales
        var gVar = aNum >= bNum; // <  >  <=  >=  ==  !=
        System.out.println("gVar = " + gVar);
        
        var edad = 22;
        var adulto = 18;
        if (edad >= adulto) {
            System.out.println("Eres mayor de edad");
        }
        else {
            System.out.println("Eres menor de edad");
        }
    }
}
