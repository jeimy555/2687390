import java.util.Scanner;

public class Reto2 {
    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        double peso,edad,dosis;
        System.out.println("ingrese la edad del bebe en meses ");
        edad=leer.nextDouble();
        System.out.println("ingrese el peso del bebe");
        peso=leer.nextDouble();
        dosis=(peso+10/edad*10)*8;
        System.out.println("la dosis a aplicar para el bebe de "+edad+" meses de edad es de "+dosis);

leer.close();
    }
}
