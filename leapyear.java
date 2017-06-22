/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prgm;

/**
 *
 * @author windows
 */
public class leap {
     public static void main(String[] args) {
         for (int i = 1900; i <= 2020;i++)
         { 
             if (i % 4 == 0 && i % 100 != 0)
             {
                 System.out.println(i);
             }
         }
}
    
}
