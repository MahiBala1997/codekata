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
public class alphabet {
     public static void main(String args[]){
        System.out.println("Enter a letter to be checked");
        Scanner s = new Scanner(System.in);
        char word;
        word = s. next().charAt(0);
        if (word>=65 && word <= 122){
      
            System.out.println("Its a alphabet");
        }
        else{
            System.out.println("Its a number");
        }
}}
