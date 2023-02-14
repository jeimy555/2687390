import java.util.Scanner;

public class Number {
    public static void main(String[] args) {
        Scanner lectura= new Scanner(System.in);

int number;
System.out.println("ingrese un numero");
number=lectura.nextInt();
if (number>0) {System.out.println("el numero es positivo");
    
}else if (number==0) {System.out.println("el numero es neutro");
    
}else{
    System.out.println("el numero es negativo");
}

lectura.close();
    }
    
}
