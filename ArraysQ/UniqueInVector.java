package ArraysQ;

import java.util.Scanner;

public class UniqueInVector {
    public static int checkUnique(int[] myar) {
        int uniq = 0;
        for (int i = 0; i < myar.length; i++) {
            uniq = uniq ^ myar[i];
        }

        return uniq;
    }

    public static void main(String[] args) {

        System.out.println("Enter the size of an VArrayector.........");
        Scanner src = new Scanner(System.in);
        int size = src.nextInt();
        int[] myarr = new int[size];
        System.out.println("Enter the elements for Array......");
        for (int i = 0; i < size; i++) {
            myarr[i] = src.nextInt();
        }

        int uniqueelement = checkUnique(myarr);
        System.out.println("element is :"+uniqueelement);
    }
}
