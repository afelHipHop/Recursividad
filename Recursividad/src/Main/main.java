/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Logica.Datos;
import Logica.multiplicacion;

/**
 *
 * @author personal
 */
public class main {
    
    public static Datos dato = new Datos();
    public static multiplicacion mult = new multiplicacion();
    //public static int a;
    
    
    public static void main(String [ ] args){
        System.out.println("Ingrese los numeros a multiplicar");
        int a = mult.multiplicar(dato.leerDatoA(), dato.leerDatoB());
        System.out.println("el resultado es: "+a);
    }
}
