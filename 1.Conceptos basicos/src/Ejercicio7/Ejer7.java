
package Ejercicio7;

import java.util.Locale;
import java.util.Scanner;


public class Ejer7 {

/*Sería interesante disponer de un programa que pida como entrada un 
número decimal y lo muestre redondeado al entero más próximo*/
    
    public static void main(String[] args) {
    
        double num;
        int redondeo;
        
        Scanner sc = new Scanner (System.in);
        sc.useLocale(Locale.US);//para usar el punto en vez de la coma
        
        System.out.print("Introduce un numero decimal: ");
        num = sc.nextDouble();
        
        redondeo = (int) (num + 0.5);
        
        System.out.println("El numero redondeado es: "+redondeo);
    
    }
    
}
