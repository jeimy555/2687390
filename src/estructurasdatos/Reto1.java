package estructurasdatos;

import java.util.Scanner;

public class Reto1 {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        int c,contador;
        
        float promedio,acumulador;
        contador=0; acumulador=0;
        
        System.out.println("ingrese la cantidad de datos");
        c=leer.nextInt();
        float notas[]=new float[c];
        for (int f = 0; f < notas.length; f++) {
            System.out.println("digite las notas");
           notas[f]=leer.nextFloat();
           contador=contador+1;
           acumulador=acumulador+notas[f];
        }
        promedio=acumulador/contador;
        if (promedio>4.0) {
            System.out.println("tu promedio es "+promedio+" aprobaste con buenos resultados");
            
        } else if (promedio<=3 && promedio>=4.0) {
            System.out.println("tu promedio es "+promedio+"pasasre raspando");
            
        } else {
            System.out.println("tu promedio es "+promedio+" reprobaste");
        }
        



    }
}
