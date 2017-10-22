/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package amar_examples;

class a {
    int a,b;
    void get(int a, int b){
        this.a=a;
        this.b=b;
     }
    void show(){
        System.out.println("a is "+a+"b is "+b);
    }
}
class b extends a{
    int c,d;
    void get1(int c,int d,int e, int f){
        this.c=c;
        this.d=d;
        get(e,f);
    }
    void show1(){
        System.out.println("a is "+a+"b is "+b+"c is "+c+"d is "+d);
    }
    
}
public class inhertance {
 public static void main(String args[]){
    b obj= new b();
    
    obj.get1(5,66,3,44);
    obj.show1();
 }   
}
