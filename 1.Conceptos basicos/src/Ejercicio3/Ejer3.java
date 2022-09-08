
package Ejercicio3;

import java.util.Scanner;


public class Ejer3 {

/*Escribir una aplicación que pida el año actual y el de nacimiento del 
usuario. Debe calcular su edad , suponiendo que en el año en curso el 
usuario ya ha cumplido años*/
    
    public static void main(String[] args) {
    
        int anioactual;
        int anionacimiento;
        int edad;
        
        Scanner sc = new Scanner (System.in);
        
        System.out.print("Introduce el año actual: ");
        anioactual =sc.nextInt();
        System.out.print("Introduce el año de nacimiento: ");
        anionacimiento =sc.nextInt();
        
        edad = anioactual-anionacimiento;
        
        System.out.println("La edad es de: "+edad+ " años");
        
        
        
    }
    
}
