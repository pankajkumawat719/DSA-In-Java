package ArraysQ;

import java.util.Scanner;

public class LinearSearchIn2D {

    public static void main(String[] args) {
        System.out.println("Finding key in an 2D array...............");
        Scanner src = new Scanner(System.in);
        System.out.println("Enter key");
        int key = src.nextInt();
        System.out.println("ENter row: ");
        int row = src.nextInt();
        System.out.println("Enter col");
        int col = src.nextInt();
        int arr[][] = new int[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = src.nextInt();
            }
        }
        System.out.println("Break");

        System.out.println("Printing");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }

        System.out.println("Break");

        for (int i = 0; i <row; i++) {
            for (int j = 0; j < col; j++) {
                if (key == arr[i][j]) {
                    System.out.println("Found.......");
                    break;
                }
            }

        }
    }

}
