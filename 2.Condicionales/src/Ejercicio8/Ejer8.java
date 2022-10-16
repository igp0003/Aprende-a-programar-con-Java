
package Ejercicio8;

import java.util.Scanner;


public class Ejer8 {

/*Pedir los coeficientes de una ecuacién se 2.° grado, y mostrar sus soluciones reales. Si
no existen, debe indicarlo. Recordemos que las soluciones de una ecuacion de segundo
grado, ax^2 + bx +c = 0 son,

              x=-b+- raiz^2de(b^2-4ac)
                        2a
 */
    
    public static void main(String[] args) {
    
        double a;
        double b;
        double c;
        double raiz,parent,res1,res2;
        
        
        Scanner sc = new Scanner (System.in);
        
        System.out.print("Introduce a: ");
        a=sc.nextDouble();
        System.out.print("Introduce b: ");
        b=sc.nextDouble();
        System.out.print("Introduce c: ");
        c=sc.nextDouble();
        
        
        //parent = (int)(Math.pow(b, 2))-(4*a*c);
        parent = (b*b)-(4*a*c);//discriminante
        raiz = Math.sqrt(parent);
        System.out.println(parent);
        System.out.println(raiz);
        
        if(parent<0){
            System.out.println("No tiene soluciones reales");
        }else{
            if(a ==0){
                System.out.println("No es una ecuacion de segundo grado");
            }else{
                res1=(-b+ (raiz))/2*a;
                res2=(-b- (raiz))/2*a;
        
                System.out.println("Resultado 1: "+res1);
                System.out.println("Resultado 2: "+res2);
            }
        
        }
        
        
    }
    
}
