import java.util.Scanner;

public class Challenge4 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int aleatorio=3, numero ;
        System.out.println("Escoque tu jugada 1.tijera 2.piedra 3.papel ");
        numero=leer.nextInt();
        
        aleatorio=(int)(Math.random()*3+1);
        if (aleatorio==numero) { System.out.println("EMPATE");    
        }else
        if (aleatorio==1 && numero==2) {System.out.println("usted ha elegido piedra y ha ganado contra tijera ");
        }else
        if (aleatorio==3 && numero==2)  {System.out.println("usted ha elegido piedra y ha perdido contrapapel ");
        }else 
        if (aleatorio==1 && numero==3) {System.out.println("usted ha elegido papel y ha perdido contra tijera");
        }else 
        if (aleatorio==3 && numero==1) {System.out.println("usted ha elegido tijera y ha ganado contra papel");
        }else 
        if (aleatorio==2 && numero==1) {System.out.println("usted ha elegido tijera y ha perdido contra piedra ");
        }else 
        if(aleatorio==2 && numero==3)  {System.out.println("usted ha elegido papel y ha ganado contra piedra ");
        }
    
     leer.close();
        }
      }


