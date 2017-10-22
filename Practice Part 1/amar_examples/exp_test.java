/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package amar_examples;

import java.util.Random;

public class exp_test {
   static public void main (String args[]){
   int a=0,b=0,c=0;
   Random r=new Random();
   for(int i=0;i<32000;i++){
       try { 
           a=r.nextInt(10)+1;
           b=r.nextInt(100)+11;
           c=12300/(a/b);
   }
   catch(ArithmeticException x){
       System.out.println("zero error : "+ x);
   c=0;
    }
       System.out.println("c is "+c);
   }
   }
}
