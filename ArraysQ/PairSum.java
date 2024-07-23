package ArraysQ;

import java.util.Vector;

public class PairSum {
    public static void main(String[] args) {
        System.out.println("Sum of Pares.........");
        int arr[] = {1,3,4,7,5,3,2,9,6};
//        int start = 0;
//        int next = 1;
        int sum= 7;
//        Vector<Integer> myvect;

        for (int i=0;i< arr.length;i++){
            for (int j=i+1;j< arr.length;j++){
                if (sum==arr[i]+arr[j])
                {

                    System.out.println("Milgya "+arr[i]+" "+arr[j]);
                }
            }
        }
    }
}
