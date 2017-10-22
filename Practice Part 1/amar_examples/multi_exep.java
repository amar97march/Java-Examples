/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package amar_examples;

public class multi_exep {
    static public void main(String args[]){
        try { 
            int a=args.length;
            System.out.println("args' length is "+a);
            int b=40/2;
            int c[]= new int[5];
            c[11]=43;
        }
        catch (ArithmeticException e){
            System.out.println("error is: "+e);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Index error; "+e);
        }
    }
}
