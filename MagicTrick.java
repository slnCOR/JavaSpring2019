/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package magictrick;

/**
 *
 * @author Michael
 */
import java.util.Scanner;
import java.util.Arrays;
public class MagicTrick {
    
    public static int y;
    public static int [] main = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21};
    
    public static int[][] splitDeck(int [] arr){
        int size = arr.length/3;
        int k=arr.length-1;
        int [][] split = new int[3][size];
            for(int i=0 ; i<split.length ; i++){
                for(int j=0;j<split[i].length; j++){
                  split[i][j]=arr[k];
                  k -= 1;
                  }
                }
            return split;
            }
    
    static int swapDeck(int arr[][], int x){
        switch(x){
            case 1 : arr = arr; 
            break;
            case 2 : arr = arr;
            break;
            case 3 : arr = arr;
            default: x = 0;
        }
        return a;
    }
    
    public static void printMagic(int mat[][]){
        int x = 1;
        for (int[] row : mat){
            System.out.println(x + ". " + Arrays.toString(row));
            x+=1;
        }
    }
        
    public static void magicTrick(){
        int[][] a = splitDeck(main);
        int x;
        Scanner input = new Scanner(System.in);
        System.out.println("Think of a number from the numbers given below.");
        System.out.println();
        System.out.println(Arrays.toString(main));
        System.out.println("Press 0 to continue");
        x = input.nextInt();
        if (x==0){
        } else {
            System.out.println("You must enter 0");
        }
        System.out.println();
        System.out.println("Select the row number that contains you number");
        System.out.println();
        printMagic(a);
        y = input.nextInt();
        if (y==1||y==2||y==3){  
        }else{
             System.out.println("You must select 1, 2, or 3");
             magicTrick();
        }
    }
    
    public static void main(String[] args) {
        magicTrick();
    }
    
}
