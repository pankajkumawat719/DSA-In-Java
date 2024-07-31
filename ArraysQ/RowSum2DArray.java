package ArraysQ;

import java.util.Scanner;

public class RowSum2DArray {
    public static void main(String[] args) {
        System.out.println("Sum of rows in 2D array.......");
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
                System.out.print(" ");
            }
            System.out.println();
        }

        System.out.println("rowise sum");
        for (int row= 0;row<i;row++){
            int sum = 0;
            for (int col = 0; col<j;col++){
                 sum+= arr[row][col];
            }
            System.out.println("sum is :"+sum);
        }

        System.out.println("cols sum");
        for (int row= 0;row<i;row++){
            int sum = 0;
            for (int col = 0; col<j;col++){
                sum+= arr[col][row];
            }
            System.out.println("sum is :"+sum);
        }

    }
}
