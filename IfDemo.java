/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifdemo;

/**
 *
 * @author Michael
 */
public class IfDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int testcore = 76;
        char grade;
        
        if(testcore >= 90){
            grade = 'A';
        }else{
            grade = 'X';
        }
        System.out.println("Grade = " + grade);
    }
}
