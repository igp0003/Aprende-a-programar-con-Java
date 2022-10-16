
package Ejercicio7;

import java.util.Scanner;


public class Ejer7 {

    /*Pedir tres numeros y mostrarlos ordenados de mayor a menor.*/
    
    public static void main(String[] args) {
    
        int a;
        int b;
        int c;
        
        Scanner sc = new Scanner (System.in);
        
        System.out.print("Introduce el primer numero: ");
        a =sc.nextInt();
        System.out.print("Introduce el segundo numero: ");
        b =sc.nextInt();
        System.out.print("Introduce el tercer numero: ");
        c =sc.nextInt();

        if (a >b && b >c){
            System.out.println("Orden: "+a+", "+b+ ", "+c);
        }else if (a >c && c >b){
            System.out.println("Orden: "+a+", "+c+ ", "+b);
        }else if (b>a && c<a){
            System.out.println("Orden: "+b+", "+a+ ", "+c);
        }else if (b>c && a<c){
            System.out.println("Orden: "+b+", "+c+ ", "+a);
        }else if (c>a && b<a){
            System.out.println("Orden: "+c+", "+a+ ", "+b);
        }else if (c>b && a<b){
            System.out.println("Orden: "+c+", "+b+ ", "+a);
        }
 
    }
    
}
