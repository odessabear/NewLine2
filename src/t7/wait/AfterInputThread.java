package t7.wait;

/**
 * Created by X501A on 15.08.2017.
 */
public class AfterInputThread implements Runnable{
    @Override
    public void run() {
        StorageStrings strings = new StorageStrings();

        for (int i = 0;i < 10000000;i++ ){
           strings.addString("sd" +i);
            try {
                synchronized (strings.getMonitor()){
                    strings.getMonitor().notify();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
