
package Ejercicio1;

import java.util.Scanner;


public class Ejer1 {

/*Diseñar un programa que pida un número al usuario -por teclado- y a 
continuación lo muestre */
    
    public static void main(String[] args) {
    
        int num;
        
        Scanner sc = new Scanner (System.in);

        System.out.print("Escriba un numero: ");
        num = sc.nextInt();
        
        System.out.println("El numero introducido es: "+num);
    }
    
}
