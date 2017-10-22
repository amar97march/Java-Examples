/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package multi_threading;

class callme{
    void call(String msg){
        System.out.print("["+msg);
    try {
        Thread.sleep(1000);
    } catch(InterruptedException e){
        System.out.println("callme interuppted");
    }System.out.println("]") ;  
    }
}
class caller implements Runnable {
    String msg;
    callme target;
    Thread t;
    public caller(callme trg, String s){
        target=trg;
        msg=s;
        t= new Thread(this);
        t.start();
    }
    public void run(){
        synchronized(target){
        target.call(msg); }
    }
    }
public class synchronised {
    public static void main(String args[]){
        callme target = new callme ();
        caller ob1= new caller(target,"one");
        caller ob2= new caller(target,"two");
        caller ob3=new caller (target,"three");
        try{
            ob1.t.join();
            ob2.t.join();
            ob3.t.join();
        }
        catch(InterruptedException e){
            System.out.println("main interrupted");
        }
    }
}

