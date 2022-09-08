
package Ejercicio6;

import java.util.Scanner;


public class Ejer6 {

/*Modificar el ejercicio anterior para que muestre la parte entera de 
la media de tres notas decimales */
    
    public static void main(String[] args) {
    
        int nota1,nota2,nota3;
        int media;
        
        Scanner sc = new Scanner (System.in);
        
        System.out.print("Primera nota: ");
        nota1=sc.nextInt();
        System.out.print("Segunda nota: ");
        nota2=sc.nextInt();
        System.out.print("Tercera nota: ");
        nota3=sc.nextInt();
        
        media = (int)(nota1+nota2+nota3)/3;
        
        System.out.println("La nota media es: " + media);
    }
    
}
