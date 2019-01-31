/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package palindrome;

/**
 *
 * @author Michael
 */

import java.util.Scanner;
public class Palindrome {

    /**
     * @param args the command line arguments
     */
    
    
    public static void main(String[] args) {
        int step;
        int output;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Palindrome Step 1-7: ");
        step = scan.nextInt();
        
         switch(step) {
            case 1 : output = 1*1;
            break;
            case 2 : output = 11*11;
            break;
            case 3 : output = 111*111;
            break;
            case 4 : output = 1111*1111;
            break;
            case 5 : output = 11111*11111;
            break;
            case 6 : output = 111111*111111;
            break;
            case 7 : output = 1111111*11111111;
            break;
            default: output = 0;
        }
        System.out.println(output);
    }
}
