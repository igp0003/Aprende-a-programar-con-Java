
package Ejercicio2;

import java.util.Scanner;


public class Ejer2 {

/*Pedir al usuario su edad y mostrar la que tendrá el próximo año */
    
    public static void main(String[] args) {
    
        int edad;
        
        Scanner sc =new Scanner (System.in);
        
        System.out.print("Introduce tu edad: ");
        edad =sc.nextInt();
        
        edad++; //edad = edad +1;
        
        System.out.println("Tu edad dentro de un año sera: "+edad + " años");
    }
    
}
