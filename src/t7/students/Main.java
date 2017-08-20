package t7.students;

import t7.treadsPrograms.FindFilesTaskImpl;

import java.io.FileNotFoundException;

/**
 * Created by X501A on 12.08.2017.
 */
public class Main {
    public static void main(String[] args) {
        FindFilesTaskImpl findFilesTask = new FindFilesTaskImpl();
        try {
            findFilesTask.setDirectory("dfd");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        Thread st1 = new Thread(new Student(25,"Vasya"));
        Thread st2 = new Thread(new Student(18,"Tanya"));
        Thread st3 = new Thread(new Student(9,"Katya"));
        st1.setName("First");
        st1.start();
        st2.start();
        st3.start();
        try {
            Thread.currentThread().sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(Thread.currentThread().getName());

    }
}
