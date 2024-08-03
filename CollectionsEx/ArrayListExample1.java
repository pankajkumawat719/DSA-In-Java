package CollectionsEx;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample1 {
    public static void main(String[] args) {
        System.out.println("Array list example 1...........");
        ArrayList<String> fruits = new ArrayList<String>();
        fruits.add("Mango");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Graphes");
        fruits.add("Papaya");
        System.out.println(fruits);

        // Iterating using iterator
        System.out.println("Iteration using iterator interface");
        Iterator itr = fruits.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
        System.out.println();

        // iterating using enhance for loop
        System.out.println("Iterating using enhance ofr loop.........");
        for (String fruit : fruits){
            System.out.println(fruit);
        }
    }
}
