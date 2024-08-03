package CollectionsEx;

import java.util.ArrayList;
import java.util.Iterator;

class Student{
    int rollno;
    String name;
    int age;

    Student(int rollno, String name, int age){
        this.rollno = rollno;
        this.name = name;
        this.age = age;
    }
}
public class ObjectTypeArrayList {
    public static void main(String[] args) {

        Student s1 = new Student(101,"Sumit",24);
        Student s2 = new Student(102,"Ambar",23);
        Student s3 = new Student(103,"Rahul",28);
        ArrayList<Student> al = new ArrayList<Student>();
        al.add(s1);
        al.add(s2);
        al.add(s3);

        Iterator itr = al.iterator();
        while (itr.hasNext()){
            Student s = (Student)itr.next();
            System.out.println("rollnumber is : "+s.rollno+" and name is : "+s.name+" and age is : "+s.age);
        }
        Student s4 = new Student(104,"karan",32);
        System.out.println(al.add(al.set(1,s4)));
        for (Student student:al){
            System.out.println(student.rollno+" "+student.name+" "+student.age);
        }
    }
}

