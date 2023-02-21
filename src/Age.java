import java.util.Scanner;

public class Age{
    public static void main(String[] args) {
        Scanner lectura= new Scanner(System.in) ;
        int age;
        System.out.println( "ingrese su edad");
        age=lectura.nextInt();
        if (age>=18) {
            System.out.println("¡bienvenido siga!");
            
        }else{ System.out.println("acceso denegado"); };
    lectura.close();

    }
}