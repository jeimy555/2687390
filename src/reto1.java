import java.util.Scanner;

public class reto1 {
    public static void main(String[] args) throws Exception {
       Scanner lectura = new Scanner(System.in);
       double temperature1, temperature2;
       System.out.println("ingrese la temperatura en grados centigrados(C°)");
       temperature1=lectura.nextDouble();
       temperature2= (temperature1-32)/1.8 ;
       System.out.println("la temperatura en grados Fahrenheit(F°) es "+temperature2+"(F°)");


lectura.close();
    }
}