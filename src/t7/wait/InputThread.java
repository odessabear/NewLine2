package t7.wait;

import java.util.Scanner;

/**
 * Created by X501A on 15.08.2017.
 */
public class InputThread implements Runnable{
    private boolean isStop = false;

    @Override
    public void run() {
        Scanner in =  new Scanner(System.in);
        StorageStrings storage = new StorageStrings();
        while (!isStop){
            String str = in.nextLine();
            storage.addString(str);
            try {
                synchronized (storage.getMonitor()){
                    storage.getMonitor().notify();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            if (str.equals("stop")){
                isStop = true;
            }
        }
    }
}
