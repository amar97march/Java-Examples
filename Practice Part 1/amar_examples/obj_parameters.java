class first{
    int a,b;
    first(){
        a=-1;
        b=-1;
    }
    first(int c,int d){
        a=c;
        b=d;
    }
    first(first obj){
        a=obj.a;
        b=obj.b;
    }
    void show(){
        System.out.println("a is"+a+"\nb is"+b);
    }
}
public class obj_parameters {
    static public void main(String args[]){
    first ob1=new first();
    first ob2=new first(4,55);
    first ob3=new first(ob2);
    ob1.show();
    ob2.show();
    ob3.show();
    }
}