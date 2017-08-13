package t7;

/**
 * Created by X501A on 12.08.2017.
 */
public class MainT7 {
    public static void main(String[] args) {
        Thread thread1 = new MyThread();
        thread1.start();
        for (int i = 1; i <= 10; i++) {
            try {
                Thread.currentThread().sleep(1000);
                Thread.currentThread().setPriority(Thread.MIN_PRIORITY);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(i);
        }
    }
}
