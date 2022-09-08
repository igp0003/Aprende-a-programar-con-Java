
package Ejercicio8;

import java.util.Locale;
import java.util.Scanner;


public class Ejer8 {

/*Un frutero necesita calcular los beneficios anuales que obtiene de la 
venta de manzanas y peras . Por este motivo , es necesario diseñar una 
aplicación que solicite las ventas( en kilos ) de cada trimestre para cada
fruta . La aplicación mostrará el importe total sabiendo que el precio del 
kilo de manzanas está fijado en 2.35 euros y el kilo de peras está fijado 
en 1.95 euros*/
    
    public static void main(String[] args) {
    
        final double manzanas =2.35;
        final double peras = 1.95;
        
        int man1,man2,man3,man4; //trimestre de las manzanas
        int per1,per2,per3,per4; //trimiestre de las peras
        
        double totaldinero;
        
        Scanner sc = new Scanner (System.in);
        sc.useLocale(Locale.US);//para usar el punto en vez de la coma
        
        System.out.println("Manzanas");
        System.out.print("Primer trimestre: ");
        man1 =sc.nextInt();
        System.out.print("Segundo trimestre: ");
        man2 =sc.nextInt();
        System.out.print("Tercer trimestre: ");
        man3 =sc.nextInt();
        System.out.print("Cuarto trimestre: ");
        man4 =sc.nextInt();
        
        System.out.println("------------------------");
        
        System.out.println("Peras");
        System.out.print("Primer trimestre: ");
        per1 =sc.nextInt();
        System.out.print("Segundo trimestre: ");
        per2 =sc.nextInt();
        System.out.print("Tercer trimestre: ");
        per3 =sc.nextInt();
        System.out.print("Cuarto trimestre: ");
        per4 =sc.nextInt();
        
        totaldinero = (man1+man2+man3+man4)*manzanas;
        totaldinero = totaldinero +((per1+per2+per3+per4)*peras);
        
        System.out.println("El importe total es de: "+totaldinero+ " euros");
    }
    
}
