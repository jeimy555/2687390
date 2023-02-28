import java.util.Scanner;

public class Reto3 {
    public static void main(String[] args) {
        
        Scanner scanner= new Scanner(System.in);
        int number;
        number=(int)(Math.random()*2+1);
         int number2;
        
        System.out.println("ingrese un numero del 1 al 2, 1 siendo cara y 2 siendo cruz");  
        number2=scanner.nextInt();
       
        
        if (number==1 && number==number2) { System.out.println("usted ah elegido cara y es el ganador");
            } 
            else if (number==2 && number==number2) { System.out.println("usted ah elegido cruz y es el ganador");
            } 
            else if (number==1) {
                System.out.println("usted ah elegido cruz y ah perdido");
            }
            else if (number==2 ) { 
                System.out.println("usted a elegido cara y ah perdido");
                
            }
            

        scanner.close();

        

        
    }
}
