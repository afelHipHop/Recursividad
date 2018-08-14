/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Logica.Datos;
import Logica.potenciacion;

/**
 *
 * @author kevin
 */
public class Main {
    
    public static Datos dato = new Datos();
    public static potenciacion pot = new potenciacion();
    
    public static void main(String [ ] args){
        System.out.println("Ingrese primero la base y luego el numero al que quiere elevar");
        int a = pot.potenciar(dato.leerDatoA(), dato.leerDatoB());
        System.out.println("el resultado es: " +a );
    }
    
    /*int res = 0;
        double a=0,b=0;
        Scanner S = new Scanner(System.in);
        System.out.println("introduzca la base");
        a = S.nextDouble();
        System.out.println("introduzca el exponente");
        b = S.nextDouble();
        //int resultado=(int) Math.pow(a, b);*/
}
