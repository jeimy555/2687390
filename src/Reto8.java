import java.util.Scanner;

public class Reto8 {
    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        int price,amount,discount,bolita,total,op,contador,acumulador,pay,change;
        
        bolita=(int)(Math.random()*4+1);

        contador=0;
        acumulador=0;
        op=0;
        discount=0;
        pay=0;
        change=0;

        
        
        do {
        System.out.println("ingrese el precio del producto a registrar");
        price=leer.nextInt();
        System.out.println("ingrese la cantidad del producto a registrar");
        amount=leer.nextInt();
        System.out.println("desea registrar otro producto? 1.si 2.no");
        op=leer.nextInt();
        contador=contador+1;
        acumulador=acumulador+(price*amount);
        
            
        } while (op==1);
        System.out.println("el precio total de los productos es "+acumulador);


        if (acumulador>50000 && bolita==1)
        //hallar descuento  y restarselo a la compra
        {discount=(10*acumulador)/100; total=acumulador-discount; 
            //texto que se muestra si se cumpe la condicion
         System.out.println("felicidades ah ganado un descuento del 10% en su compra por sacar la bolita roja, el total de su compra ahora seria "+total);
         System.out.println("ingrese el valor con el que va a pagar");
        pay=leer.nextInt();
        change=pay-total;
        System.out.println("su cambio es "+change);

        } else if (acumulador>50000 && bolita==2)
        {discount=(30*acumulador)/100; total=acumulador-discount;
            
         System.out.println("felicidades ah ganado un descuento del 30% en su compra por sacar la bolita azul, el total de su compra ahora seria "+total);
         System.out.println("ingrese el valor con el que va a pagar");
        pay=leer.nextInt();
        change=pay-total;
        System.out.println("su cambio es "+change); 

        } else if (acumulador>50000 && bolita==3)
        {discount=(50*acumulador)/100; total=acumulador-discount;
            
         System.out.println("felicidades ah ganado un descuento del 50% en su compra por sacar la bolita amarilla, el total de su compra ahora seria "+total);
         System.out.println("ingrese el valor con el que va a pagar");
        pay=leer.nextInt();
        change=pay-total;
        System.out.println("su cambio es "+change);

        } else if (acumulador>50000 && bolita==4)
        {discount=acumulador; total=acumulador-discount;
            
         System.out.println("felicidades ah ganado un descuento del 100% en su compra por sacar la bolita blancaazul, el total de su compra ahora seria "+total);
            //texto que se muestra si no se cumple ninguna condicion
            System.out.println("ingrese el valor con el que va a pagar");
            pay=leer.nextInt();
            change=pay-total;
            System.out.println("su cambio es de "+change);

        }else {
            System.out.println("lo lamentamos su compra no es superior a 50000 y por esto no hay descuento");
        }

        



        leer.close();

    
    
    


    }
}
