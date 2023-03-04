import java.util.Scanner;

public class Challenge5 {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        String name,lastname,fullname;
        System.out.println("ingrese su nombre");
        name=leer.next();
        System.out.println("ingrese su apellido");
        lastname=leer.next();
        fullname=name+lastname;

        System.out.println("el largo de su nombre es "+name.length()+" y el largo de su apellido es "+lastname.length());
        System.out.println("su nombre completo es "+fullname);
        System.out.println("su nombre es"+name.toUpperCase()+" "+lastname.toLowerCase());
        System.out.println(name.substring(0, 2)+lastname);
        leer.close();
    



    }
}
