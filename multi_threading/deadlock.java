package multi_threading;

class A{
    synchronized void foo(B b){
         String name= Thread.currentThread().getName();
        System.out.println(name+" entered A.foo");
    try{
        Thread.sleep(1000);
    }
    catch(InterruptedException e){
        System.out.println("A interrupted");
    }
    System.out.println(name+"trying to call b.last()");
    b.last();
    }
    synchronized void last(){
        System.out.println("Inside A's last()");
    }
}
class B{
    synchronized void bar(A a){
        String name= Thread.currentThread().getName();
        System.out.println(name+" entered B.bar()");
        try{
            Thread.sleep(1000);
        }catch(InterruptedException e){
           System.out.println("B interrupted");
        }
        System.out.println(name+"trying to call A's last()");
    a.last();
    }
    synchronized void last(){
        System.out.println("B's last()");
    }
}
public class deadlock implements Runnable{
    A a=new A();
    B b=new B();
    deadlock(){
        Thread.currentThread().setName("MainThread");
        Thread t=new Thread(this,"RacingThread");
        t.start();
        
        a.foo(b);
        System.out.println("returnin to main Thread");
        }
    public void run(){
        b.bar(a);
        System.out.println("returning to racing thread");
    }
    static public void main(String args[]){
        new deadlock();
    }
}
