
package Ejercicio12;

import java.util.Scanner;


public class Ejer12 {

/*Pedir el dia, mes y año de una fecha e indicar si la fecha es correcta. 
Recordamos que existen meses con 28, 30 y 31 dias. No consideraremos los años 
bisiestos.*/
    
    public static void main(String[] args) {
    
        int diasdelMes=0;
        int dia;
        int mes;
        int anio;
        
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Introduce el dia: ");
        dia=sc.nextInt();
        System.out.println("Introduce el mes: ");
        mes=sc.nextInt();
        System.out.println("Introduce el año: ");
        anio=sc.nextInt();
        
        
        if(mes == 2){ //febrero tiene 28 dias
            diasdelMes =28;
        }else if (mes ==4 ||mes ==6 ||mes ==9 ||mes ==11){
            diasdelMes =30;
        }else if (mes ==1 ||mes ==3 ||mes ==5 ||mes ==7||mes ==8||mes ==10||mes ==12){
            diasdelMes =31;
        }
        
        dia++; //incrementamos el dia
        
        if(dia> diasdelMes){
            dia =1; //reiniciamos dia a 1
            mes++;//incrementamos el mes
            
            if(mes>12){//se mes supera 12
                mes =1;//lo reiniciamos a 1
                anio++;//incrementamos el años
            }
        }
        if (anio==0){//el año 0 no existio por eso empieza desde uno
            anio=1;
        }
        
        System.out.println(dia+"/"+mes+"/"+anio);
    }
    
}
