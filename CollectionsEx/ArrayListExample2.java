package CollectionsEx;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample2 {
    public static void main(String[] args) {
        System.out.println("Use of get() and det() method ");
        ArrayList<String> fruits = new ArrayList<String>();
        fruits.add("Mango");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Graphes");
        fruits.add("Papaya");
        System.out.println(fruits);
        System.out.println("Get element is : "+fruits.get(1));
        fruits.add(fruits.set(2,"Jamun"));
        System.out.println("set element : ");

        Iterator itr = fruits.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
        System.out.println();
    }
}
