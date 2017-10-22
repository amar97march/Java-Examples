class ab {
    int a,b;
    ab (int c,int d){ a=c; b=d; }
    ab () { a=0; b=0;}
    void display() {
    System.out.println("a is" + a + "b is" + b);
}
}
public class NewClass {
    public static void main (String args[]){
        ab object = new ab();
        object.a=1;
        object.b=18;
        object.display();
        ab obj1 = new ab(3,4);
        obj1.display();
    }
}
