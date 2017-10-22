class cls{
    int a,b;
    void input(int a,int b){
        this.a=a;
        this.b=b;
    }
    void display(){
        System.out.println("a= "+a+"\nb="+b );
    }
}
public class this_use {
    static public void main(String args[]){
    cls obj = new cls();
    obj.input(4,66);
    obj.display();
    }
}
