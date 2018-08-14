/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

/**
 *
 * @author kevin
 */
public class potenciacion {
    int res;
    public int potenciar(int a, int b){

    if (b==0)
        return 1;
    else {if(b%2==0){
    res = potenciar(a,b/2);
            return res*res;}
    else{ return a*potenciar(a,b-1);}}
    }
    
    /*else { if (b%2==0){
        temp = expR(a,b/2);
        resultado = temp*temp;
        }else {
    resultado = a*expR(a,b-1);}
    } */  
}
