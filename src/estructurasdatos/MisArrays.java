package estructurasdatos;

import java.util.Scanner;

public class MisArrays {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        int [] vector1= new int[10];
        int [] vector={30,50,25,85,12,6,32,41,23,63};
        vector1[6]=32;   
        
        for (int p = 0;p<vector.length; p++) {
            System.out.print(vector[p]+" ");
        } 

        for (int i : vector) {
            System.out.println(i);
        }
        //rellenar array de forma dinamica
        for (int p = 0; p < vector.length; p++) {
            System.out.println("digite el dato de la posicion"+p);
            vector1[p]=leer.nextInt();
        }
    for (int i : vector1) {
        System.out.println(i);
    }
    
    leer.close();
    }
    
}
