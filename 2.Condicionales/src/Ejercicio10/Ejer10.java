
package Ejercicio10;

import java.util.Scanner;


public class Ejer10 {

    /*Pedir un numero entre 0 y 9 999 y decir si es capicua*/
    
    public static void main(String[] args) {
    
        Scanner sc = new Scanner (System.in);
        
        int dm ,um ,c ,d,u ; //guara cada cifra del numero
        boolean capicua = false;// indica si el numero es capicua, suponemos que no lo es
        int num;
        
        System.out.print("Introduzca un numero entre 0 y 99.999:");
        num = sc.nextInt();
        
        //descomponer el numero dividiendo entre 10 y mediante el resto
        u = num %10; //unidades, ejemplo, 12345 sera el 5
        num = num/10; //eliminamos las unidades del numero, sera 1234
        
        d = num %10; //unidades, ejemplo, 1234 sera el 4
        num = num/10; //eliminamos las unidades del numero, sera 123
        
        c = num %10; //unidades, ejemplo, 123 sera el 3
        num = num/10; //eliminamos las unidades del numero, sera 12
        
        um = num %10; //unidades, ejemplo, 12 sera el 2
        num = num/10; //eliminamos las unidades del numero, sera 1
        
        dm = num; // el numero solo contiene las decenas de millar, osea 1
        
        //si el numero tiene 5 cifras
        if (dm !=0 &&dm ==u &&um ==d ){ // probar 12321
            capicua=true;
            
        }
        //si tiene 4 cifras
        if(dm==0 && um !=0 && um == u && c ==d){
            capicua=true;
            
        }
        //si tiene 3 cifras
        if (dm == 0&&um ==0 && c !=0 && c == u){
            capicua=true;
            
        }
        //si tiene 2 cifras
        if (dm ==0 && um ==0&& c ==0 && d !=0 && d ==u){
            capicua=true;
            
        }
        //los dm al ser solo una cifra no capicua
        
        if (capicua){
            System.out.println("El numero capicua");
        }else{
            System.out.println("El numero no capicua");
        }
    }
    
}
