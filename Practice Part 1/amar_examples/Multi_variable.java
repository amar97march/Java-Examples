/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package amar_examples;

/**
 *
 * @author amar97march
 */
public class Multi_variable {
    public static void main (String args[]){
        int arr[][][]= new int [3][3][3];
        for(int x=0;x<3;x++){
            for(int y=0;y<3;y++){
                for(int z=0;z<3;z++){
                arr[x][y][z]=x*y*z;
            }
            }
        }
        for(int x=0;x<3;x++){
            for(int y=0;y<3;y++){
                for(int z=0;z<3;z++){
                System.out.print(arr[x][y][z] + " ");
                }
             System.out.print("\n");
            }  
            System.out.print("\n");
        } 
}
}