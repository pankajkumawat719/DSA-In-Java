package ArraysQ;

import java.util.Arrays;
import java.util.Scanner;

public class Array2D {
    public static void main(String[] args) {
        System.out.println("Imput in 2D array......");
        Scanner src = new Scanner(System.in);

        System.out.println("Enter size of row..........");
        int i = src.nextInt();
        System.out.println("Enter sizeo f column...............");
        int j = src.nextInt();
        int[][] arr =  new int[i][j];
        System.out.println("Now initialixzation..........");
        for (int row = 0; row <i; row++){
            for (int col = 0; col< j; col++){
               System.out.println("Enter element for "+"("+row+","+col+")");
               arr[row][col] = src.nextInt();
            }
        }
        System.out.println("Now print ");

        for (int row = 0; row<i;row++){
            for (int col = 0 ; col < j; col++){
                System.out.print(arr[row][col]);
            }
            System.out.println();
        }
        //for column wisw
        System.out.println("For column wise data print");

        for (int row = 0; row<i;row++){
            for (int col = 0 ; col < j; col++){
                System.out.print(arr[col][row]);
            }
            System.out.println();
        }
    }
}
