/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author amar97march
 */
public class for_dowhile_break_continue {
 public static void main(String args[]){
    int arr[]= {77,0,78,67,2,86};
     for(int i=0;i<6;i++) {
   System.out.print("no is" + arr[i]);
     }
     System.out.println();
     for(int x:arr){
       System.out.print("no is" + x);  
     if(x==67) break;
     }
     System.out.println();
     int arr2[][]= new int[5][5];
     for (int k=0;k<5;k++){
         for(int l=0;l<5;l++){
             arr2[k][l]=k*l;
          
         }
     }
     loop : {for (int k=0;k<5;k++){
         for(int l=0;l<5;l++){
          System.out.print("no1 is " + arr2[k][l]);
          if (l==4)break loop; 
         }
         }         
     } }
}
