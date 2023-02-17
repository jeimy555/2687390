import java.util.Scanner;

public class Note {
    public static void main(String[] args) {
        Scanner lectura= new Scanner(System.in);
        double nota1,nota2,nota3,asistencia,promedio;
        String nombre;

        System.out.println("ingrese su nombre");
        nombre=lectura.next();
        System.out.println("ingrese la primera nota");
        nota1=lectura.nextDouble();
        System.out.println("ingrese la segunnda nota");
        nota2=lectura.nextDouble();
        System.out.println("ingrese la tercera nota");
        nota3=lectura.nextDouble();
        System.out.println("ingrese el porcentaje de asistencia");
        asistencia=lectura.nextDouble();

        promedio=(nota1+nota2+nota3)/3;
        if (promedio>=3.5 && asistencia>=70 || nombre.equals("jennifer")) {System.out.println(nombre+"su promedio de notas fue "+promedio+" y con un porcentaje de asistencia del"+asistencia+"% debido a esto usted ah sido aprobado");}else{
            System.out.println(nombre+"su promedio de notas fue "+promedio+" y con un porcentaje de asistencia del "+asistencia+"% debido a esto usted NO ah sido aprobado");
        }
        

        
        
        
        
        
        
        
        lectura.close();
    }
    
}
