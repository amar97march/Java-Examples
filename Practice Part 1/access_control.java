class first1{
    private int a,b;
    void get(int a,int b){
        this.a=a;
        this.b=b;
    }
    void show(){
        System.out.println("a and b are:"+a+" and "+b);
    }
} 
public class access_control {
    static public void main(String args []){
        first1 obj=new first1();
        obj.get(8,44);
        obj.show();
    // obj.a=55;   
    }            
}
