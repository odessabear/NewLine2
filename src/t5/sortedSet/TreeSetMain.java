package t5.sortedSet;

import java.util.Iterator;
import java.util.TreeSet;

/**
 * Created by X501A on 15.07.2017.
 */
public class TreeSetMain {
    public static void main(String[] args) {
        Student st1 = new Student(21,"Vasya");
        Student st2 = new Student(19,"Lena");
        Student st3 = new Student(18,"Katya");

        TreeSet<Student> students = new TreeSet<>();
        students.add(st1);
        students.add(st2);
        students.add(st3);
        for(Iterator<Student> iterator = students.iterator();iterator.hasNext();){
            System.out.println(iterator.next());
        }
    }
}
