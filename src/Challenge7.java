import java.util.Scanner;

public class Challenge7 {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        int discount,bolita,buy,total;
        System.out.println("ingrese el valor de su compra");
        buy=leer.nextInt();
        //generador de numero aleatorio
        bolita=(int)(Math.random()*4+1);
        //inicializar la variable descuento
        discount=0;
        //condicion
        if (buy>50000 && bolita==1)
        //hallar descuento  y restarselo a la compra
        {discount=(10*buy)/100; total=buy-discount; 
            //texto que se muestra si se cumpe la condicion
         System.out.println("felicidades ah ganado un descuento del 10% en su compra por sacar la bolita roja, el total de su compra ahora seria "+total);
            
        } else if (buy>50000 && bolita==2)
        {discount=(30*buy)/100; total=buy-discount;
            
         System.out.println("felicidades ah ganado un descuento del 30% en su compra por sacar la bolita azul, el total de su compra ahora seria "+total);
            
        } else if (buy>50000 && bolita==3)
        {discount=(50*buy)/100; total=buy-discount;
            
         System.out.println("felicidades ah ganado un descuento del 50% en su compra por sacar la bolita amarilla, el total de su compra ahora seria "+total);
            
        } else if (buy>50000 && bolita==4)
        {discount=buy; total=0;
            
         System.out.println("felicidades ah ganado un descuento del 100% en su compra por sacar la bolita blancaazul, el total de su compra ahora seria "+total);
            //texto que se muestra si no se cumple ninguna condicion
        }else {
            System.out.println("lo lamentamos su compra no es superior a 50000 y por esto no hay descuento");
        }



        leer.close();
    }
}
