package BinarySearch;

import java.util.Arrays;

public class SimpeBinarySearch {
    public static  int checkValue(int myarr[], int target){
        int start = 0;
        int end = myarr.length-1;
        int mid = (start+end)/2;
        System.out.println(Arrays.toString(myarr));

        while (start<=end){
            int element = myarr[mid];
            if (target == element){
                return mid;
            }
            else if (target<element){
                end = mid-1;
            }
            else {
                start = mid+1;
            }
            mid = (start+end)/2;
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {10,20,30,40,50,60,70,80,90};
        int targetVal = 30;

        int returnTarget = checkValue(arr,targetVal);
        if (returnTarget == -1){
            System.out.println("target not found.......");

        }
        else {
            System.out.println("found target "+(arr[returnTarget])+" at index "+returnTarget);
        }
    }
}
