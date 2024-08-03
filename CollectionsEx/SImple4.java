package CollectionsEx;

import java.util.Iterator;
import java.util.Vector;

public class SImple4 {
    public static void main(String[] args) {
        System.out.println("for vector ..........in list");
        Vector<Integer> v1 = new Vector<>();
        v1.add(20);
        v1.add(40);
        v1.add(60);
        v1.add(10);

        for (Integer integer : v1) {
            System.out.println(integer);
        }
    }
}
