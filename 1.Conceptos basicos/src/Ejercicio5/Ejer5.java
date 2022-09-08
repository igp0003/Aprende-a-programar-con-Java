
package Ejercicio5;

import java.util.Scanner;


public class Ejer5 {

/*Necesitamos una aplicación que calcule la media aritmética de dos 
notas enteras. Hay que tener en cuenta que la media puede contener 
decimales*/
    
    public static void main(String[] args) {
    
        int nota1,nota2;
        double media;
        
        Scanner sc = new Scanner (System.in);
        
        System.out.print("Primera nota: ");
        nota1=sc.nextInt();
        System.out.print("Segunda nota: ");
        nota2=sc.nextInt();
        
        media = (nota1+nota2)/2;
        
        System.out.println("La nota media es: " + media);
    }
    
}
