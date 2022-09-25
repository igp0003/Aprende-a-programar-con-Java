
package Ejercicio5;

import java.util.Locale;
import java.util.Scanner;


public class Ejer5 {

/*Implementar un programa que pida por teclado un numero decimal e indique si es un
numero casi-cero, que son aquellos, positivos o negativos, que se acercan a 0 por menos
de 1 unidad, aunque curiosamente el 0 no se considera un numero casi-cero. Ejemplos
de numeros casi-cero son el 0.3, el -0.99 0 el 0.123. Y numeros que no se consideran
casi-ceros son: el 12.3, el 0 u el 1. */
    
    public static void main(String[] args) {
    
        double num;

        Scanner sc = new Scanner (System.in);
        sc.useLocale(Locale.US);//para usar el punto en vez de la coma
        
        System.out.print("Introduce un numero decimal: ");
        num =sc.nextDouble();
        
        if(num>0 && num<1 || num<0 && num>-1){
            System.out.println("El numero "+num+ " es un casi-cero");
        }else{
            System.out.println("No es un numero casi-cero");
        }
        
    }
    
}
