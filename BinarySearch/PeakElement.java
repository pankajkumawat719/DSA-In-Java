package BinarySearch;

public class PeakElement {
    public  static  int findPeakElement(int my[]){
        int start = 0;
        int end = my.length-1;
        int mid = start+(end-start)/2;
        int elemet = -1;
        while (start<end){
            System.out.println("at start = "+start);
            System.out.println("at end = "+end);
            System.out.println("at mid = "+mid);
            if (my[mid]<my[mid+1]){
                start = mid+1;

            }
            else {
                end = mid;
            }
            mid = start+(end-start)/2;
        }
        return start;

    }
    public static void main(String[] args) {
        System.out.println("Finding peak element in an array.........");

        int myArray[] = {2,3,4,5,6,7,88,9,4,2,1};

        int result = findPeakElement(myArray);
        System.out.println(result);
//        if (){
//            System.out.println("nhi mila");
//        }
//        else {
//            System.out.println("milgya");
//        }

    }
}
