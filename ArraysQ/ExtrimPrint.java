package ArraysQ;

public class ExtrimPrint {
    public static void main(String[] args) {
        System.out.println("Printing Extream number");

        int myarry[] = {10,20,30,40,50,60,70,80,90};
        int startIndx = 0;
        int exdIndx  = myarry.length-1;
       
        while (true) {
            if (startIndx>exdIndx)
            break;

            if (startIndx == exdIndx) {
                System.out.println(myarry[startIndx]);
            }
            else {
                System.out.println(myarry[startIndx]);
                System.out.println(myarry[exdIndx]);
            }
            startIndx++;
            exdIndx--;
        }
    }
    
}
