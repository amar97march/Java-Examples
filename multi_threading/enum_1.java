/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package multi_threading;
enum Apple {golden,pink,red
}    

public class enum_1 {
    static public void main(String args[]){
        Apple ap;
        Apple allValues[]= Apple.values();
        for (Apple a: allValues)
            System.out.println(a);
        ap=Apple.valueOf("golden");
        ap=Apple.golden;
        System.out.println("ap contains "+ap);
        System.out.println("Value of ap is "+ap);
        ap=Apple.pink;
        if(ap==Apple.pink){
            System.out.println("It is equivalent");
        }
        switch(ap){
            case golden:{System.out.println("golden"); break;}
            case pink: { System.out.println("golden"); break; }
            case red: { System.out.println("red"); break; }
            default: System.out.println("NO MATCH");
        }
    }
}
