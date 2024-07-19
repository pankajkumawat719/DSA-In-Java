package ArraysQ;

public class MaximumInArray {
    public static void main(String[] args) {
        System.out.println("Finding the maximum element in an array ..........");
        int mynewArr[] = {5,67,32,4,68,7,34,5,4,3,2,5,7,97,6,54,32,24,68,9};

        int maxNum = Integer.MIN_VALUE;

        for(int i=0;i<mynewArr.length;i++){
            if (maxNum < mynewArr[i]) {
                maxNum = mynewArr[i];
            }

        }
        System.out.println("Max valueis : "+maxNum);

    }
    
}
