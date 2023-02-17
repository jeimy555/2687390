import java.util.Scanner;

public class User {
    public static void main(String[] args) {
        Scanner lectura=new Scanner(System.in);
        String user,pass;
        
        System.out.println("ingrese su usuario");
        user=lectura.next();
        System.out.println("ingrese su contraseña");
        pass=lectura.next();

        if (user.equals("yurany555") && pass.equals("1032677961") ) { System.out.println("bienvenido al sistema");
            } else if (user.equals("yurany")) {System.out.println("parece qhy");
                
            }

    }
}
