/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prgm;

import java.util.Scanner;

/**
 *
 * @author windows
 */
public class factorial {
    public static void main(String args[]){
        System.out.println("enter a number");
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int fac = 1;
        for (int i=1;i<=a;i++)
        {
            fac = fac*i;
           // System.out.println(fac);
        }
        System.out.println(fac);
    }
    
}
