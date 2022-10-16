
package Ejercicio2;

import java.util.Scanner;


public class Ejer2 {

    /*Pedir dos numeros enteros y decir si son iguales o no.*/
    
    public static void main(String[] args) {
    
        int num1;
        int num2;
        
        Scanner sc = new Scanner (System.in);
        
        System.out.print("Introduce el primer numero: ");
        num1 =sc.nextInt();
        System.out.print("Introduce el segundo numero: ");
        num2 =sc.nextInt();
        
        if (num1==num2){
            System.out.println("Ambos numeros son el mismo");
        }else{
            System.out.println("Son numeros distintos");
        }
    }
    
}
