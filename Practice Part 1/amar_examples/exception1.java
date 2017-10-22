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
public class exception1 {
    public static void exception1func(){
       try { int d=1;
        int a = 42/d; }
       catch (ArithmeticException x){
       System.out.println(" not divisible by zero");
       }
       System.out.println("divisible by zero");
       }
   
    
    public static void main (String args[]){
     
       exception1.exception1func();
        
}
    
}
