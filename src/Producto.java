import java.util.Scanner;

public class Producto {
    public static void main(String[] args) {
        Scanner lectura= new Scanner(System.in);
        int precio, cantidad,contador,subtotal,acumulador,pago,cambio;
        String telefonia;
        
        //bucle
        contador=0; acumulador=0;
        for (int x = 1; x <=5; x++) 
    {
        System.out.println("ingrese el precio del producto");
        precio=lectura.nextInt();
        
        
        System.out.println("digite la cantidad del producto");
        cantidad=lectura.nextInt(); 
        contador=contador+1;
        subtotal=precio*cantidad;
        acumulador=acumulador+subtotal;
    }
        System.out.println("su subtotal es "+acumulador);
        System.out.println("ingrese valor con el que va a pagar");
        pago=lectura.nextInt();
        cambio=pago-acumulador;
        System.out.println("su cambio es de "+cambio);
        System.out.println("¿usted cuenta con telefonia movil exito?");
        telefonia=lectura.next();
        if (telefonia.equals("si")) { System.out.println("usted ah obtenido "+contador+" minutos por su compra");
            
        }else{
            System.out.println("No pierdas mas minutos, adquiere ya tu telefonia movil exito");
        }
    lectura.close();


    }
    
}
