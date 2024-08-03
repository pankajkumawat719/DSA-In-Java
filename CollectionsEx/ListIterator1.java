package CollectionsEx;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIterator1 {
    public static void main(String[] args) {
        ArrayList<String> ar1 = new ArrayList<>();
        ar1.add("pankaj");
        ar1.add("sumit");
        ar1.add("rahul");
        ar1.add("karan");

//        ListIterator<String> li = ar1.listIterator(ar1.size());
//
//        for (li.hasPrevious()){
//            String str = li.previous();
//            System.out.println("element: "+str);
//        }
        for (int i=0;i<ar1.size();i++){
            System.out.println(ar1.get(i));
        }
    }
}
