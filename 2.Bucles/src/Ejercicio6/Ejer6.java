
package Ejercicio6;

import java.util.Scanner;


public class Ejer6 {

    /*Pedir dos numeros y mostrarlos ordenados de forma decreciente.*/
    
    public static void main(String[] args) {
    
        int num1;
        int num2;
        
        Scanner sc = new Scanner (System.in);
        
        System.out.print("Introduce el primer numero: ");
        num1 =sc.nextInt();
        System.out.print("Introduce el segundo numero: ");
        num2 =sc.nextInt();
        
        if(num1 < num2){
            System.out.println("El orden seria "+num1+ " y "+num2);
        }else if(num1 > num2){
            System.out.println("El orden seria "+num2+ " y "+num1);
        }else {
            System.out.println("Son iguales");
        }
        
    }
    
}
