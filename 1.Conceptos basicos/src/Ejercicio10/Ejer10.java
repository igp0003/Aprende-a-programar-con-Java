
package Ejercicio10;

import java.util.Locale;
import java.util.Scanner;


public class Ejer10 {

/*Diseñar una aplicación que calcule la longitud y el área de una 
circunferencia . Para ello , el usuario debe introducir el radio 
( que puede contener decimales ). Recordamos : 
    longitud =2*PI * radio
    área = PI * radio^2
*/
    
    public static void main(String[] args) {
    
        Scanner sc = new Scanner (System.in);
        sc.useLocale(Locale.US);//para usar el punto en vez de la coma
        
        final double PI =3.14;
        double radio;
        double area,longitud;
        
        System.out.print("Introduce el radio: ");
        radio =sc.nextDouble();
        
        longitud= 2* PI * radio;
        area = PI * (Math.pow(radio, 2));
        
        System.out.println("La longitud es: "+longitud);
        System.out.println("El area es: "+area);
    }
    
}
