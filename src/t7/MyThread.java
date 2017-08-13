package t7;

/**
 * Created by X501A on 12.08.2017.
 */
public class MyThread extends Thread {

    @Override
    public void run() {
        for (int i = 1000; i <= 1020; i++){
            System.out.println(i);
            try {
                Thread.currentThread().sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
