
package Ejercicio3;

import java.util.Scanner;


public class Ejer3 {

/*Solicitar dos numeros distintos y mostrar cual es el mayor.*/
    
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
            System.out.println("Tienen que ser distintos");
        }
    }
    
}
