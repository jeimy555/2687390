import java.util.Scanner;

public class Presupuesto {
    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        int spent,budget,totals,op,acumulador1,acumulador2;
        op=1;
        budget=100000;
        acumulador1=0;
        acumulador2=0;


        for (int x = 1; x <=3; x++)
        { while (op==1) {
    

        System.out.println("ingrese el gasto");
        spent=leer.nextInt();
        totals=budget-spent;
        acumulador1=acumulador1+totals;
        acumulador2=acumulador2+spent;
        
        
        
        
        
        System.out.println("¿desea registrar otro gasto? 1. si 2.no");
        op=leer.nextInt();
        
    
    
    }}



leer.close();

    }
}
