class box{
    int height, width,length;
            box(){
                length=-1;
                width=-1;
                height=-1;
            }
    box(int length,int width,int height){
        this.length=length;
        this.width=width; 
        this.height=height;
    }
    box(int length){
        this.length=width=height=length;
    }
    box(box ob){
        length=ob.length;
        width=ob.width;
        height=ob.height;
        
    }
    void display(){
        System.out.println("l is "+length+" b is "+width+" h is "+height);
    }
}
class weight extends box {
 int bx;
 weight(){
     length=-1;
     width=-1;
     height=-1;
    bx=-1;
 }
 weight(int l,int b, int h, int w){
     length=l;
     width=b;
     height=h;
     bx=w;  
 }     

}
public class super_reference_sub {
  public static void main(String args[]){
   box ob1=new box(2,3,4);
   box ob2=new box();
   weight wb1=new weight(2,4,2,5);
   ob2=wb1;
   ob1.display();
   ob2.display();
  }  
}
