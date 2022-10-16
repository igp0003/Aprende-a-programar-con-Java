
package Ejercicio11;

import java.util.Scanner;


public class Ejer11 {

/*Pedir una nota de 0 a 10 y mostrarla de la forma: Insuficiente (de 0 a 4), 
Suficiente (5), Bien (6), Notable (7 y 8) y Sobresaliente (9 y 10).*/
    
    public static void main(String[] args) {
    
        int nota;
        
        Scanner sc = new Scanner (System.in);
        
        System.out.print("Introduce una nota: ");
        nota = sc.nextInt();
        
        switch (nota){
            case 0:
            case 1:
            case 3:
            case 4:
                System.out.println("Insuficiente");
                break;
            case 5:
                System.out.println("Suficiente");
                break;
            case 6:
                System.out.println("Bien");
                break;
            case 7:
            case 8:
                System.out.println("Notable");
                break;
            case 9:
            case 10:
                System.out.println("Sobresaliente");
                break;
            default:
                System.out.println("La nota no es valida");
                break;
            
        }
    }
    
}
