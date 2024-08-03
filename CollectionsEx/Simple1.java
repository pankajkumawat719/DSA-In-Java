package CollectionsEx;

import java.util.*;

public class Simple1 {
    public static void main(String[] args) {
        System.out.println("Welcome in collection");
        List<String> s1 = new ArrayList<>();
        s1.add("Pankaj");
        s1.add("Sumit");
        s1.add("Ambar");
        s1.add("Rahuliya");
        List<Integer> s2 = new ArrayList<>();
        List<Boolean> s3 = new LinkedList<>();
        List<Double> s4 = new Vector<>();

        System.out.println("Now printing the list item ........");
        Iterator its = s1.iterator();
        while(its.hasNext()){
            System.out.println(its.next());
        }

    }
}
