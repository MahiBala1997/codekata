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
public class string {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a string");
        String word = s.nextLine();
        int length = word.length();
        char c='0';
        char count ='0',cn='0';
        for(int i = 0;i<length;i++){ // System.out.println("letters"+c);
         c = word.charAt(i);
         cn = word.charAt(i+1);//System.out.println(c+cn);
         count = c;
         c = cn;
         cn= count;
         System.out.println(c+cn);
      
        }
     
    }
}
      
