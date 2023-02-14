import java.util.Scanner;

public class reto1 {
    public static void main(String[] args) throws Exception {
       Scanner lectura = new Scanner(System.in);
       double temperature1, temperatureF;
       System.out.println("ingrese la temperatura en grados centigrados(C°)");
       temperature1=lectura.nextDouble();
       temperatureF= (temperature1-32)/1.8 ;
       System.out.println("la temperatura en grados Fahrenheit(F°) es "+temperatureF+"(F°");


lectura.close();
    }
}