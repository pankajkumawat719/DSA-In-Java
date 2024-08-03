package CollectionsEx;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList6 {
    public static void main(String[] args) {
        ArrayList<String> al=new ArrayList<String>();
        System.out.println("is array list empty "+al.isEmpty());
        al.add("Ravi");
        al.add("Vijay");
        al.add("Ajay");

        ArrayList<String> al2=new ArrayList<String>();
        al2.add("Ravi");
        al2.add("Hanumat");
        al2.add("Vijay");
        al.retainAll(al2);

        Iterator itr = al.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }

        System.out.println("is array empty : "+al.isEmpty());
    }
}
