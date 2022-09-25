
package Ejercicio1;

import java.util.Scanner;


public class Ejer1 {

/*Diseñar una aplicacion que solicite al usuario un numero e indique si es par o impar.*/
    
    public static void main(String[] args) {
    
        int num;
        
        Scanner sc = new Scanner (System.in);
        
        System.out.print("Introduce un numero: ");
        num =sc.nextInt();
        
        if (num%2==0){
            System.out.println("El numero " +num+ " es par");
        }else{
            System.out.println("El numero " +num+ " es impar");
        }
    }
    
}
