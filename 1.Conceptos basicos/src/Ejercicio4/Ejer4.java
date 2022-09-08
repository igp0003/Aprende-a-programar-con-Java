
package Ejercicio4;


public class Ejer4 {

/*El tipo short permite almacenar valores comprendidos entre -32 768 y 
32 767. Se pide escribir un programa que compruebe que el rango de valores 
de un tipo se comporta de forma cíclica , es decir , el valor siguiente al 
máximo es el valor mínimo y viceversa*/
    
    public static void main(String[] args) {
    
        short num;
        num = 32767;
        System.out.println("Valor maximo para el tipo short: "+num);
        num++;
        System.out.println("Valor minimo para el tipo short: "+num);
        
    }
    
}
