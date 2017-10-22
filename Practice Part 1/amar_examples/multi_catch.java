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
public class multi_catch {
    public static void main (String args[]){
    try{
        int a= args.length;
    System.out.println("a is "+ a);
    int b = 12/a;
    int c[]= {1};
    c[3]=34;}
    catch(ArithmeticException a){
        System.out.println("a is zero");
    }
    catch(ArrayIndexOutOfBoundsException a){
    System.out.println("short array");
    }
    
    }
}
