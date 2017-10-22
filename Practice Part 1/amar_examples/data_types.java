/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package amar_examples;

/**
 *
 * @author amar97march
 */
public class data_types {
    public static void main(String args[]){
        int days, seconds,speed;
        days=365;
        seconds=days*24*60*60;
        speed=300000000;
        System.out.print("In " + days);
        System.out.print(" light will travel " + speed*seconds);
        System.out.print(" metres");
    }
          
    
}
