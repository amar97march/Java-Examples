package amar_examples;
class outer{
    int a,b;
    void get(int e, int f){
        a=e;
        b=f;
    }
    void show(){
        inner obj2=new inner();
        obj2.display();
    }
    class inner {
        int c=4,d=44;
        void display(){
            System.out.println(a+"\n"+b+"\n"+c+"\n"+d+"\n");
        }
    }
    }


public class inner_class {
    static public void main(String args[]){
        outer obj = new outer();
        obj.get(9,887);
     System.out.println(obj.a+"\n"+obj.b);
     obj.show();
     }
}
