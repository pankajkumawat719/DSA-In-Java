package ArraysQ;

import java.util.Arrays;
import java.util.Vector;

public class SwapZeroOne {
    public static void main(String[] args) {
//      int myarr[] = {0, 1, 0, 1, 1, 1, 0, 0, 1, 1, 0, 1, 0, 1, 1, 0};
        int myar[] = {10,20,30,40,50,60,70,80};
        int start = 0;
        int end = myar.length - 1;

        for (int i=0;i< myar.length;i++){
            int temp = myar[start];
            myar[start] = myar[end];
            myar[end] = temp;


            start++;
            end--;

            if (start>end){
                break;
            }
        }
        System.out.println(Arrays.toString(myar));
    }
}
