package ArraysQ;

import java.util.Arrays;
import java.util.Scanner;

public class FindKey {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        System.out.println("Enter the size of array.....");
        int size = src.nextInt();
        int myArray[] = new int[size];
        System.out.println("Enter the elements to array....");
        for (int i = 0; i < size; i++) {
            System.out.println("Enter the element for indx : " + i);
            myArray[i] = src.nextInt();
        }
        System.out.println(Arrays.toString(myArray));

        System.out.println("Enter the key to find in array........");
        int key = src.nextInt();

        for (int j=0;j< myArray.length;j++){
            if (myArray[j]== key)
            {
                System.out.println("key fond.........");

            }

        }

    }

}
