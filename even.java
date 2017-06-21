import java.util.Scanner;
import java.util.*;

/**
 *
 * @author windows
 */
public class odd {
    public static void main(String args[]){
        System.out.println("Enter a number to be checked");
        Scanner s = new Scanner(System.in);
        int num = s. nextInt();
        if(num%2 == 0){
            System.out.println("The number is even");
        }
        else{
            System.out.println("The number is odd");
        }
    }
    
}
