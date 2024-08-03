package CollectionsEx;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList5 {
    public static void main(String[] args) {
        System.out.println("Remove ...........");
        ArrayList<String> arl = new ArrayList<>();
        System.out.println("declare arraly list :"+arl);
        arl.add("banana");
        arl.add("orange");
        arl.add("papaya");
        arl.add("graphes");
        System.out.println(arl);
        arl.remove(0);// banana remove
        System.out.println("banana remove "+arl);
        arl.remove("orange");
        System.out.println("orange remove "+arl);
        ArrayList<String> arl2 = new ArrayList<>();
        arl2.add("mango");
        arl2.add("blackbery");
        System.out.println(arl2);
        System.out.println(arl);
        arl.addAll(arl2);
        System.out.println(arl);
        arl.removeIf(str -> str.contains("mango"));   //Here, we are using Lambda expression
//        arl.clear();
        System.out.println(arl);
        Collections.sort(arl);
        System.out.println("`sorted`"+arl);
        System.out.println(arl.size());
    }
}
