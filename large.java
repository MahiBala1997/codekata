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
public class largest {
    public static void main(String args[]){
        System.out.println("Enter a three numbers to be checked");
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();
        if(a>b && a>c){
              System.out.println("The larger number is:"+a);
        }
        else if(b>a && b>c){
              System.out.println("The larger number is:"+b);
        }
        else{
             System.out.println("The larger number is:"+c);
        }
    }
    
}
