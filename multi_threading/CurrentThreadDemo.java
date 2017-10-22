/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package multi_threading;

//creating a second thread
class NewThread implements Runnable{
    Thread t;
    NewThread (String name){
        String name1=name;
     t= new Thread(this,name1);
     System.out.println("Child Thread:"+ t);
     t.start();
    }
    //Entry for the secnod thread
   public void run(){
    try {
    for(int n=5;n>0;n--){
        System.out.println("child  thread is "+ n);
        t.sleep(1000);
    }
}
    catch(InterruptedException e){
        System.out.print("Child is Interrupted");
    }
    System.out.println("exiting child...");
}
}
 class CurrentThreadDemo {
    public static void main(String[] args) {
    NewThread ob1=new NewThread("one");
    NewThread ob2=new NewThread("two");
    NewThread ob3=new NewThread("three");
    System.out.println(" thread one is alive:"+ob1.t.isAlive());
    System.out.println(" thread two is alive:"+ob2.t.isAlive());
    System.out.println(" thread three is alive:"+ob3.t.isAlive());
     /*   Thread t = Thread.currentThread();
    System.out.println(" thread is:"+ t);
    // now change the current Thread name
    t.setName("new_thread");
    System.out.println("New Thread Name is :"+t); */
    try{
        /*for(int n=5;n>0;n--)
        {
            System.out.println("Main Thread: "+ n);
            Thread.sleep(10000);
        }*/
    System.out.println("Waiting for thread to finih");
    ob1.t.join();
    ob2.t.join();
    ob3.t.join();
    }
    catch(InterruptedException e){
    System.out.println(" Main Thread is interrupted");
    }
    System.out.println(" thread one is alive:"+ob1.t.isAlive());
    System.out.println(" thread two  is alive:"+ob2.t.isAlive());
    System.out.println(" thread three is alive:"+ob3.t.isAlive());
    System.out.println("Exiting main");
    }
    
}
