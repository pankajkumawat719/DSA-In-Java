package BinarySearch;

public class FindNumberUsingPivot {
    public static  int myPivotNumber(int ar[]){
        int start = 0;
        int end = ar.length-1;

        while (start<=end){
            int mid = start+(end-start)/2;

            if (ar[mid]> ar[mid+1]){
                return  mid;
            }
            if (ar[mid-1]> ar[mid]){
                return mid-1;
            }
            if (ar[end]<ar[start]){
                start = mid+1;
            }
            else
                end = mid-1;
            mid = start+(end-start)/2;
        }
        return +1;
    }
    public static void main(String[] args) {
        int myArr[] = {3,4,5,6,7,8,1,2};
        int result = myPivotNumber(myArr);
        System.out.println(myArr[result]);
    }
}
