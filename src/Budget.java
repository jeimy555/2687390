import java.util.Scanner;

public class Budget {
    public static void main(String[] args) {
        Scanner lectura= new Scanner(System.in);
        
        double ancho, largo, presupuesto,area; 
        System.out.println("ingrese el ancho");
        ancho=lectura.nextDouble() ;
        System.out.println("ingrese largo");
        largo=lectura.nextDouble();

        area=ancho*largo;
        presupuesto=45000*area;
        System.out.println("la superficie a cubrir es de "+ancho+" metros de ancho por "+largo+" metros de largo con "+area+" metros cuadrados.El presupuesto del proyecto es $"+presupuesto);

lectura.close();
    }

}
