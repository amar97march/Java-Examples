/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package amar_examples;

class first2{
    void test(int a,int b,int ...v){
        
        for(int x:v){
            System.out.println(a+" "+b+" "+x+" ");
        }
    }
}
public class varags {
    public static void main (String args[]){
    first2 obj= new first2();
    obj.test(3,4,5,2);
    System.out.println(" ");
    obj.test(3,4,3,3);
    }
}