
package Ejercicio4;

import java.util.Scanner;


public class Ejer4 {

/*Realizar de nuevo el ejercicio anterior considerando el caso de que los numeros intro-
ducidos sean iguales.*/
    
    public static void main(String[] args) {
    
        int num1;
        int num2;
        
        Scanner sc = new Scanner (System.in);
        
        System.out.print("Introduce el primer numero: ");
        num1 =sc.nextInt();
        System.out.print("Introduce el segundo numero: ");
        num2 =sc.nextInt();
        
        if (num1 != num2){
            if(num1>num2){
                System.out.println("El primer numero es el mayor");
            }else{
                System.out.println("El segundo numero es el mayor");    
            }
        }else{
            System.out.println("Ambos numeros son iguales");
        }
    }
    
}
