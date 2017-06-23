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
public class leave {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        String day = s.next();
        char c = day.charAt(1);
        if (c == 'u')
        {
            System.out.println("holiday");
        }
        else{
            System.out.println("workingday");
        }
    }
}
