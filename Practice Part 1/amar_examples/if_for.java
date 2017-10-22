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
public class if_for {
    public static void main(String args[]){
        int x,y;
        y=20;
        for(x=0;x<10;x++) {
         System.out.println("value of x is "+ x);
         System.out.println("Vlaue of y is " + y);
         y=y-2;
         if(x>5){
             System.out.println("x is greater than 5.");
         }
        }
    }
}
