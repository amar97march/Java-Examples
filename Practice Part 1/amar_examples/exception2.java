/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package amar_examples;
import java.util.Random;
/**
 *
 * @author amar97march
 */
public class exception2 {
    public static void main(String args[]){
    int a=0,b=0,c=0;
    Random r=new Random();
    for(int i=0;i<3200;i++){
    try {
    b=r.nextInt();
    c=r.nextInt();
    a=12345/(b/c);
    }
    catch (ArithmeticException x){
    System.out.println("Divisible by zero  and "+ x);
    a=0;
    }
    System.out.println("a is "+ a);
    }
    }
}
