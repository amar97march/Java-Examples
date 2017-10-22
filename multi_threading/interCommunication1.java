/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package multi_threading;

class Q{
    int n;
    boolean value=false;
    synchronized int get(){
        while(!value)
            try{
                wait();
            }
            catch(InterruptedException e){
                System.out.println("Exception caught");
            }
        
       System.out.println("got"+n);  
       value=false;
       notify();
       return n;
    }
    synchronized void put(int n){
        while(value)
            try{
                wait();
            }
            catch(InterruptedException e){
                System.out.println("Exception caught");
            }
            this.n=n;
            value=true;
             System.out.println("put:"+n);
             notify();
        }
        }
       
    

class producer implements Runnable{
    Q q;
    producer(Q q){
        this.q=q;
       new Thread(this,"producer").start();
           }
    public void run(){
        int i=0;
        while(true){
            q.put(i++);
        }
    }
}
class consumer implements Runnable{
    Q q;
    consumer(Q q){
        this.q=q;
        new Thread(this,"consumer").start();
    }
    public void run(){
        while(true){
            q.get();
        }
    }
}
 class interCommunication {
    public static void main(String args[]){
        Q q=new Q();
       new producer(q);
       new consumer(q);
    System.out.println("press control-c to stop");
    }
}
