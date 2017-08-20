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
            task1.setFileNameSearchString("java");
            task1.setPrintStream(System.out);

            FindFilesTaskImpl task2 = new FindFilesTaskImpl();
            task1.setDirectory("D:\\Видео");
            task1.setFileNameSearchString("17");
            task1.setPrintStream(System.out);

            FindFilesTaskImpl task3 = new FindFilesTaskImpl();
            task1.setDirectory("D:\\Загрузки");
            task1.setFileNameSearchString("Nik");
            task1.setPrintStream(System.out);

            CopyFileTaskImpl task4 = new CopyFileTaskImpl("D:\\Видео\\2014-05-03-767.mp4","D:\\Видео\\test.mp4",new BufferCopyFile());

            CopyFileTaskImpl task5 = new CopyFileTaskImpl("D:\\Видеоoo\\DSCN0247.AVI","D:\\Видео\\test1.AVI",new FileCopyChannel());

            CopyFileTaskImpl task6 = new CopyFileTaskImpl("D:\\Видео\\IMGP3583.AVI","D:\\Видео\\test2.AVI",new BufferCopyFile());

            TasksStorageImpl storage = new TasksStorageImpl();
            storage.add(task1);
            storage.add(task6);
            storage.add(task4);
            storage.add(task5);
            storage.add(task2);
            storage.add(task3);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
