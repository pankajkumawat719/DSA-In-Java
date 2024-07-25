package BinarySearch;

public class LastOccurence {
    public static int findLastOccurence(int arr[], int target){
        int start = 0;
        int end = arr.length-1;
        int result = -1;
        int mid = start+(end-start)/2;

        while (start<=end){
            if (target == arr[mid]){
                // store address
                result = mid;
                System.out.println("result indx of mid  store is "+result);
                // check right for final Occurence
                start = mid+1;
                System.out.println("increment in start: "+start);
            }
            else if (target<arr[mid]) {
                end = mid-1;
                System.out.println("decrement in end: "+end);
            }
            else if(target>arr[mid]) {
                start = mid+1;
                System.out.println("increment in last if  start "+start);
            }
            mid = start+(end-start)/2;
            System.out.println("update mid in last    : "+mid);
        }
        return  result;
    }
    public static void main(String[] args) {
        System.out.println("Last occurence ............");
        int myFirArr[] = {11,12,13,14,14,14,15,25};
        int target = 14;

        int result = findLastOccurence(myFirArr, target);

        if (result == -1){
            System.out.println("Not found");
        }
        else
        {   System.out.println("index is :"+result+" and the element at this index is : "+myFirArr[result]);}

    }
}
