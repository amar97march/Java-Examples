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
public class spring_if_else {
    public static void main (String args[]){
        int month=1;
        String season = null;
        if (month==4 || month==5 || month==6){
            season= "spring"; }
        if (month==1 || month==5 || month==6)
                season="summer";
    
     System.out.println("april is " + season);
    }
    
}
