package CollectionsEx;

import java.util.ArrayList;

public class AddElement {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<String>();
        System.out.println("declare arraylist "+al);
        System.out.println("Size is : "+al.size());
        al.add("gaurav");
        al.add("karan");
        al.add("purab");
        al.add("sonu");
        al.add("raghav");
        System.out.println("After initialize element in list"+al+"and size is : "+al.size());
        al.add(1,"raju");
        System.out.println("After add : "+al);

        ArrayList<String> al2 = new ArrayList<>();
        al2.add("sumit");
        al2.add("rahul");
        System.out.println("created new list : "+al2);
        System.out.println("now adding two list .......");
//        al.addAll(al2);
//        System.out.println(al);
        al2.addAll(al);
        System.out.println(al2);
        System.out.println( al2.size());
    }
}
