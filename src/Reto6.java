import java.util.Scanner;

public class Reto6 {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        int given1, given2, total,op;
        

        given1=(int)(Math.random()*6+1);
        given2=(int)(Math.random()*6+1);
        total=given1+given2;

        System.out.println("desea jugar? 1.si 2.no");
        op=leer.nextInt();
        if (op==1 && total==3) {
            System.out.println("el resultado del primer dado es "+given1+" y el resultado del segundo dado es "+given2+" el total de los dados es "+total+" y usted es un ganador!!!");
        } else
        if (op==1 && given1==1 && given2==1) {
            System.out.println("el resultado del primer dado es "+given1+" y el resultado del segundo dado es "+given2+" ah obtenido un par de unos y es un ganador!!!");
        } else 
        if (op==1 && total==12 || total==2) {
            System.out.println("el resultado del primer dado es "+given1+" y el resultado del segundo dado es "+given2+" el total de los dados es "+total+" y usted es un ganador!!!");
        } else
        if (op==1 && total==7) {
            System.out.println("el resultado del primer dado es "+given1+" y el resultado del segundo dado es "+given2+" el total de los dados es "+total+" y usted es un ganador!!!");
        } else
        if (op==1 && total==11) {
            System.out.println("el resultado del primer dado es "+given1+" y el resultado del segundo dado es "+given2+" el total de los dados es "+total+" y usted es un ganador!!!");
        } else 
        if (op!=1) {
            System.out.println(" gracias por participar vuelve pronto");
            
        }else {
            System.out.println("el resultado del primer dado es "+given1+" y el resultado del segundo dado es "+given2+" el total de los dados es "+total+" lo lamento no ah sido un ganador");
        }}
    
        








    }

