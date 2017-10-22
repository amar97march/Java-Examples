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
class void inner_catch1 (int a){
try {
if (a==0){ a=a/(a-a);
}
if (a==2){
int c[]={1};
c[3]=3;
}
}
catch (ArrayIndexOutOfBoundsException x){
    System.out.println(" array "+ x);
}
}

public static void main(String args[]){
 try{
     int a =0;
     int b= 42/a;
     System.out.println("zero");
     inner_catch1(a);
 }
 catch(ArithmeticException x){
     System.out.println("first");
 }   
}}

