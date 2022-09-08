
package Ejercicio9;

import java.util.Locale;
import java.util.Scanner;


public class Ejer9 {

/*Los precios de la fruta no suelen ser constantes ; varian según el 
mercado . Se pide modificar el ejercicio anterior para que los precios 
no estén fijados y sea la aplicación quien los pida al usuario */
    
    public static void main(String[] args) {
        
        double manzanas;
        double peras;
        
        int man1,man2,man3,man4; //trimestre de las manzanas
        int per1,per2,per3,per4; //trimiestre de las peras
        
        double totaldinero;
        
        Scanner sc = new Scanner (System.in);
        sc.useLocale(Locale.US);//para usar el punto en vez de la coma
        
        System.out.print("Introduce el precio de las manzanas: ");
        manzanas =sc.nextDouble();
        System.out.print("Introduce el precio de las peras: ");
        peras =sc.nextDouble();
        
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
