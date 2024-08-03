package CollectionsEx;

import java.util.Iterator;
import java.util.LinkedList;

public class Simple2 {
    public static void main(String[] args) {
        System.out.println("List baset example..............");

        LinkedList<String> s4 = new LinkedList<String>();
        s4.add("raghav");
        s4.add("pankaj");

        Iterator<String> itr = s4.iterator();

        while (itr.hasNext()){
            System.out.println(   itr.next());
        }

    }
}
