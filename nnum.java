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
public class nnum {
     public static void main(String args[]){
        System.out.println("Enter a no . of. elements");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int sum = 0;
         System.out.println("Enter a no . of. elements");
         for(int i=0;i<n;i++){
             int a = s.nextInt();
             sum+=a;
         }
          System.out.println("The sum is:"+sum);
     }
}
