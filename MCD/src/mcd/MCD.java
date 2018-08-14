package mcd;

import java.util.Scanner;

public class MCD {

    public static void main(String[] args) {
        
        System.out.printf("PROGRAMA CÁLCULO MCD");
        
        Scanner lector = new Scanner(System.in);
        int a,b;
        
        System.out.printf("\nIngrese el primer numero: ");
        a=lector.nextInt();
        System.out.printf("Ingrese el segundo numero: ");
        b=lector.nextInt();
        System.out.println("\nEl maximo comun divisor es:" + mcd(a,b));
        System.out.println("\n");
    }
    
     public static int mcd (int a,int b){
         if(b==0){
          return a;   
         }
         else if(a==0){
             return b;
         }
         else if(a>=b){
             return mcd(a-b,b);
         }
         else{
             return mcd(a,b-a);
         }
        }
}
