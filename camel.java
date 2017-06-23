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
public class camel {
    public static void main(String args[]){
        //Scanner s = new Scanner(System.in);
        String word = "mahi bAlA";
        StringBuffer n = new StringBuffer();
        // char c = word.charAt(0);
        for(String s:word.split(" ")){
          n.append(Character.toUpperCase( s.charAt(0))) ;
          if(s.length()>1){
              n.append(s.substring(1,s.length()).toLowerCase());
          }
        }
         System.out.println(n);
          
        }
}
    

