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
public class digit {
    public static void main(String args[]){
        System.out.println("Enter a number to be checked");
        Scanner s = new Scanner(System.in);
        int no = s.nextInt();
        int a=0;
        if(no<0)
        {
            no=no * -1;
        }
        else if(no==0)
        {
            no=1;
        }
        while(no>0)
        {
            no=no/10;
            a++;
        }
        System.out.println("Number of Digits in given number is: "+a);
    }
    }

