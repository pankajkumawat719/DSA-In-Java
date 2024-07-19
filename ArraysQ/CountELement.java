package ArraysQ;
public class CountELement { 
    public static void main(String[] args) {
    
        System.out.println("Count present 0 and 1 in array........");
        int zeroCount = 0;
        int oneCount = 0;

        int myarray[] = {0,1,0,1,5,8,0,1,5,4,7,9,52,25,1,5,8,0,1,58,0,};

    
        for (int i=0; i<myarray.length; i++){
            if (myarray[i]==0){
               zeroCount++;
            }
            else if ((myarray[i]==1)) {
                   oneCount++;     
            }

        }
        System.out.println("Length of my array is : "+myarray.length);
        System.out.println("Total nuber of zeors is : "+zeroCount);
        System.out.println("Total number of one int array s is : "+oneCount);

    }

}
