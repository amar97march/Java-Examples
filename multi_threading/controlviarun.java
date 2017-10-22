/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package multi_threading;
class SusNewThread implements Runnable {
    String name;
    Thread t;
    boolean suspendvalue;
    SusNewThread (String threadname){
        name=threadname;
        t=new Thread(this,name);
        System.out.println("New Thread:"+name);
        suspendvalue=false;
        t.start();
    }
    public void run(){
        try{
            for(int i=10;i>0;i--){
                System.out.println(name+" : "+i);
            Thread.sleep(200);
            synchronized (this){
                while(suspendvalue){
                    wait();
                }
            }
            }
        }
     catch(InterruptedException e){
    System.out.println(name+" Interrupted");
}
        System.out.println(name+" Exiting");
}

synchronized void mysuspend(){
suspendvalue=true;
}
synchronized void myresume(){
        suspendvalue=false;
notify(); 
}
}
class controlviarun {
    static public void main(String args[]){
        SusNewThread ob1= new SusNewThread("one");
        SusNewThread ob2= new SusNewThread("two");
        try{
            Thread.sleep(1000);
            ob1.mysuspend();
            System.out.println("Suspending thread one");
           // Thread.sleep(1000);
            ob1.myresume();
            System.out.println("Thread one resuming");
            ob2.mysuspend();
            System.out.println("Suspending thread two");
            Thread.sleep(1000);
            ob2.myresume();
            System.out.println("Resuming thread one");
        }catch(InterruptedException e){
            System.out.println("Main Thread Interrupted");
        }
    // wait for thread to finish
    try{
    System.out.println("Waiting for threads to finish");
    ob1.t.join();
   ob2.t.join();
}catch(InterruptedException e){
    System.out.println("mainthread interrupted");
}
    System.out.println("exiting main thread");
}
}
