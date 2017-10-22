
package amar_examples;
class first{
    int fac(int n){
        if (n<0) { 
            return 0; 
        }
        else if (n<1)
            return 1;
        else
        {
            int result=n*fac(n-1);
            return  result;
        }
    }
}
public class recursion {
    static public void main(String args[]){
    first obj= new first();
    System.out.println("factorial of 7 is"+ obj.fac(7));        
}
}
