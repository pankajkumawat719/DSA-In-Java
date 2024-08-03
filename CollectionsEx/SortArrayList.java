package CollectionsEx;

import java.util.*;

public class SortArrayList {
    public static void main(String[] args) {
        System.out.println("Sorting in array list..........");

//        List<String> fruits = new ArrayList<>();
//        fruits.add("Mango");
//        fruits.add("Banana");
//        fruits.add("Orange");
//        fruits.add("Graphes");
//        fruits.add("Papaya");
//        System.out.println(fruits);
//
//        Iterator itr = fruits.iterator();
//        while (itr.hasNext()){
//            System.out.println(itr.next());
//        }
//        Collections.sort(fruits);
//        System.out.println(fruits);

        List<Integer> num = new ArrayList<>();
        num.add(21);
        num.add(2);
        num.add(41);
        num.add(76);
        num.add(49);
        num.add(-49);
        System.out.println(num);
        Collections.sort(num);

        Iterator itr = num.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
        System.out.println("size of this list is "+num.size());
        System.out.println(" is empty or not  "+num.isEmpty());
        System.out.println("added : "+num.add(85));

        for (Integer i: num){
            System.out.println(i);
        }
        int size = num.size();
        System.out.println(size);


    }
}
