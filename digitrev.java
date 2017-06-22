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
public class digit1 {
    public static void main(String args[]){
        System.out.println("Enter a number");
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = 0;
        while(a>0){ 
            b=b*10;
            b = b+a%10;
            a=a/10;
        }
                System.out.println(b);
    }
    
}
