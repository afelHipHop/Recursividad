/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

/**
 *
 * @author personal
 */
public class multiplicacion {
    public int multiplicar(int a, int b){
        if(b==0)
            return 0;
        else
            return (a+multiplicar(a,b-1));
    }
}
