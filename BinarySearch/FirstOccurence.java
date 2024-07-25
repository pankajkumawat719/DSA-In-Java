    package BinarySearch;

    public class FirstOccurence {
        public static  int findFirstOccurence(int arr[], int target){
            int start = 0;
            int end = arr.length-1;
            int answer = -1;
            int mid = start+(end-start)/2;
            while (start<=end){
                if (target == arr[mid])
                {
                    answer = mid;
                    // check whether element in right side or not .......
                    end = mid-1;
                }
                else if (target>arr[mid]){
                    start = mid+1;
                }
                else if(target<arr[mid]){
                    end = mid-1;
                }
                mid = start+(end-start)/2;
            }
            return answer;

        }
        public static void main(String[] args) {
            System.out.println("To find the fir st occurence for assinding array .............");
            int myArrr[] = {1,2,3,3,3,4,4,4,4,4,5,6,6,7};
            int target = 12;

            int result = findFirstOccurence(myArrr,target);
            if (result == -1){
                System.out.println("Not found");
            }
            else
            {   System.out.println("index is :"+result+" and the element at this index is : "+myArrr[result]);}

        }
    }
