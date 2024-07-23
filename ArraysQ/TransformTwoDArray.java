package ArraysQ;

import java.util.Arrays;
import java.util.Scanner;

public class TransformTwoDArray {
    public static void main(String[] args) {

        System.out.println("Transform an array...............");
        Scanner src = new Scanner(System.in);
        System.out.println("Enter the size for row  :");
        int row=src.nextInt();
        System.out.println("Enter the size for column....");
        int col = src.nextInt();
        int myarr[][] = new int[row][col];

        System.out.println("Enter elements......");
        for (int i=0;i<row;row++){
            for (int j=0;j<col;j++){
                myarr[i][j] = src.nextInt();
            }
        }


    }
}
