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
            } else if (user.equals("yurany555")) {System.out.println("parece que olvidaste tus credenciales de acceso");
                }else if (pass.equals("1032677961")) {System.out.println("algo pasa con tus datos de acceso");
                    }else{
                        System.out.println("acceso denegado");
                    }
                    lectura.close();

    }
}
