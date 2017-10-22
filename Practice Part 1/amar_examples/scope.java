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
public class scope {
    public static void main (String args []) {
        int x=20;
        {
            x = 10;
            System.out.println("x is " + x);
        }
    }
}
