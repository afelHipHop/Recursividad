/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import java.util.Scanner;

/**
 *
 * @author personal
 */
public class Datos {
    public Scanner s = new Scanner(System.in);
    public int leerDatoA(){
        int a = s.nextInt();
        return a;
    }
    public int leerDatoB(){
        int b = s.nextInt();
        return b;
    }
}
