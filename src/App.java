import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
       Scanner lectura = new Scanner(System.in);
        int number1, number2;//variables
       System.out.println("ingrese un numero"); //escrito
       number1=lectura.nextInt();
       System.out.println("ingrese otro numero");
       number2=lectura.nextInt();
       int number3=number1+number2;

       System.out.println("la suma de los numeros es "+number3);
       lectura.nextLine();//LIMPIEZA DE BUFFER
    String name;
    System.out.println("ingrese su nombre");
    name=lectura.nextLine();

    

    System.out.println("el nombre ingresado es "+name);





        lectura.close();
    }
}
