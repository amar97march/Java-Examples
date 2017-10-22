/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package multi_threading;

class extendedthread extends Thread {
extendedthread(){
    //create a second thread
    super("demo Thread");
    System.out.println("Child Thread:"+this);
    start();
}
public void run(){
    try
{
    for(int n=5;n>0;n--){
        System.out.println("child thread no:"+n);
        Thread.sleep(1000);
    }
}
    catch(InterruptedException e){
    System.out.println("child interrupted") ;   
    }
    System.out.println("exiting child");
}
}
public class Extending_Thread {
 static public void main(String args[]){
     new extendedthread();
     try {
         for(int n=5;n>0;n--){
             System.out.println("main thread no:"+n);
             Thread.sleep(500);
         } }
         catch(InterruptedException e){
                 System.out.println("main is Interrupted");
                 }
         System.out.println("Exiting Main");
     }
 }   

