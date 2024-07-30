package SearchingAndSorting;

import java.util.Scanner;

public class SqrtOfNumber {
    public static int checkSqrt(int myArr[], int target){
        int  start = 0;
        int end = 8;
        int ans = -1;

        while (start<=end){
            int mid = start+(end-start)/2;
            if(mid*mid == target){
                return mid;
            }
            if (mid * mid > target){
                end = mid-1;
            }
            else if (mid* mid < target) {
                ans = mid;
                start = mid+1;
            }
             mid = start+(end-start)/2;
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[] = {2,3,4,5,6,7,8,9,10};
        Scanner src = new Scanner(System.in);
        System.out.println("enter target........");
        int target = src.nextInt();
        int result = checkSqrt(arr,target);

        System.out.println("Enter precision.....");
        int precision = src.nextInt();
        double step = 0.1;
        double answer = result;

        for (double k=0; k<precision;k++){
            for (double j=answer; j*j<target; j = j+step){
                answer = j;
            }
            step = step/10;
        }
        System.out.println("result is :"+answer);
    }
}
