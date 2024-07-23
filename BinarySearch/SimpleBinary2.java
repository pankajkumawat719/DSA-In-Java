package BinarySearch;

import java.util.Arrays;

public class SimpleBinary2 {


    public static void main(String[] args) {
        System.out.println("Binary Search using builting method.........");
        // my Array..........

        int myArr[] = {3,6,8,11,22,24,34,45,56,67,78};
        int target = 78;
        int result  = Arrays.binarySearch(myArr, target);
       if ( target== myArr[result]){
           System.out.println("Element found...... element is "+myArr[result]);
       }
        else {
            System.out.println(" not Found..............");
        }

    }
}
