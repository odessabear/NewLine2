package t7.treadsPrograms;

import t6.BufferCopyFile;
import t6.FileCopyChannel;

import java.io.FileNotFoundException;

/**
 * Created by X501A on 19.08.2017.
 */
public class Main {
    public static void main(String[] args) {

        try {
            FindFilesTaskImpl task1 = new FindFilesTaskImpl();
            task1.setDirectory(".");
            task1.setFileNameSearchString("jpg");
            task1.setPrintStream(System.out);

            FindFilesTaskImpl task2 = new FindFilesTaskImpl();
            task1.setDirectory("D:\\Development");
            task1.setFileNameSearchString("17");
            task1.setPrintStream(System.out);

            FindFilesTaskImpl task3 = new FindFilesTaskImpl();
            task1.setDirectory("D:\\Development");
            task1.setFileNameSearchString("file8");
            task1.setPrintStream(System.out);

            CopyFileTaskImpl task4 = new CopyFileTaskImpl("D:\\Development\\Koala.jpg","D:\\Development\\test.jpg",new BufferCopyFile());

            CopyFileTaskImpl task5 = new CopyFileTaskImpl("D:\\Development\\Lighthouse.jpg","D:\\Development\\test1.jpg",new FileCopyChannel());

            CopyFileTaskImpl task6 = new CopyFileTaskImpl("D:\\Development\\Penguins.jpg","D:\\Development\\test2.jpg",new BufferCopyFile());

            TasksStorageImpl storage = new TasksStorageImpl();
            storage.add(task1);
            storage.add(task6);
            storage.add(task4);
            storage.add(task5);
            storage.add(task2);
            storage.add(task3);

            Thread thread = new TaskExecutorImpl();
            thread.start();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
