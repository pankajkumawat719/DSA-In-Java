package ArraysQ;

import java.util.Scanner;

public class FindKey {

    public  static boolean  findKey(int newarr[], int newKey){
    // Iterate on array...........
         for (int j=0;j<newarr.length; j++){
             if (newarr[j]== newKey){
            return true;
        }
    }
         return false;
    }

    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        System.out.println("Enter the Number to find in array.....");
        int myKey = src.nextInt();
        System.out.println("The enter key is : "+myKey);
        int numberArray[] ={2,5,4,6,8,6,4,3,2,7};
        //Method to find the key in array

        boolean value =  findKey(numberArray, myKey);
        if (value == true){
            System.out.println("Find key.......");
        }
        else{
            System.out.println("key not found.......");
        }
    }
}
