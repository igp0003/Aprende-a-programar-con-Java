
package Ejercicio9;

import java.util.Scanner;


public class Ejer9 {

    /*Escribir una apliacion que indique cuantas cifras tiene un numero entero introducido
    por teclado, que estara comprendido entre 0 y 99 999*/
    
    public static void main(String[] args) {
    
        int n;
        
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Introduce un numero: ");
        n=sc.nextInt();
        
        if(n<10){
            System.out.println("Tiene 1 cifra");
        }else if (n<100){
            System.out.println("Tiene 2 cifras");
        }else if (n<1000){
            System.out.println("Tiene 3 cifras");
        }else if (n<10000){
            System.out.println("Tiene 4 cifras");
        }else if (n<100000){
            System.out.println("Tiene 5 cifras");
        }else{
            System.out.println("Tiene mas de 5 cifras");
        }
    }
    
}
