package CollectionsEx;

import java.util.ArrayList;
import java.util.Iterator;

class Book{
    int id;
    String name, author,publisher;
    int quantity;

    Book(int id, String name, String author, String publisher, int quantity){
        this.id = id;
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.quantity = quantity;

    }
}
public class BookArrayList {
    public static void main(String[] args) {
        Book b = new Book(1,"sapno ki udan","APJ kalam","Sargam printer",500);
        Book b1 = new Book(2,"swarg","sumit","pk production",1000);

        ArrayList<Book> bok = new ArrayList<Book>();
        bok.add(b);
        bok.add(b1);

        Iterator itr = bok.iterator();
        while (itr.hasNext()){
            Book book = (Book)itr.next();
            System.out.println("id is "+book.id+" and name of book is "+book.name+" author is "+book.author+" publisher is "+book.publisher+" total quantity is "+book.quantity);
        }

        System.out.println(bok.size());
        //bok.cap
        //System.out.println(bok.ensureCapacity());

    }
}
