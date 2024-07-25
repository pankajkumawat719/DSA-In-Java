package BinarySearch;

public class PivotNumberFor7 {
    public static int findPivot(int ar[]){
        int start = 0;
        int end = ar.length-1;
        int mid = start+(end-start)/2;
      while (start<=end){
          if (mid+1< ar.length && ar[mid]>ar[mid+1]){
              return mid;
          }
          if (mid-1 >= 0 && ar[mid]<ar[mid-1]) {
              return mid-1;
          }
          if (ar[mid]<ar[start]){
              end = mid-1;
          }
          else if(ar[mid]>ar[start]){
              start = mid+1;
          }
          mid = start+(end-start)/2;
      }
      return -1;
    }
    public static void main(String[] args) {
        System.out.println("Printing Pivot number 7....");
        int myArr[] = {3,4,5,6,7,1,2};
        int result = findPivot(myArr);
        System.out.println("return index id :"+result+" and value is :"+myArr[result]);
    }
}
