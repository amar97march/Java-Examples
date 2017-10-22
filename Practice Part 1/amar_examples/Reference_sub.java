/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package amar_examples;

class box{
    int l,b,h;
    box(int l,int b,int h){
        this.l=l;
        this.b=b;
        this.h=h;
    }
    box(){
        l=-1;
        b=-1;
        h=-1;      
    }
    int vol(){
        return (l*b*h);
    }       
}
class weightbox extends box{
    int weight;
    int vol(){
        return (l*b*h);
    }
    weightbox(int l,int b,int h,int weight){
        this.l=l;
        this.b=b;
        this.h=h;
        this.weight= weight;
} }
public class Reference_sub {
 public static void main(String args[]){
    box plain=new box(23,4,2);
     weightbox wb=new weightbox(34,3,553,2);
     System.out.println("plain volume is "+plain.vol());
     System.out.println("weight box volume is "+wb.vol());
     box plain2=new box();
     plain2=wb;
     System.out.println("plain volume is "+plain2.vol());
 }   
}
