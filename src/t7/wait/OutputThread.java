package t7.wait;

/**
 * Created by X501A on 15.08.2017.
 */
public class OutputThread implements Runnable{
    @Override
    public void run() {
        StorageStrings storageStrings = new StorageStrings();
        while (true){
            String getString = storageStrings.getLastString();
            if (getString == null){
                try {
                    synchronized (storageStrings.getMonitor()){
                        storageStrings.getMonitor().wait();
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }else{
                if (getString.equals("stop")){
                    return;
                }
                System.out.println(new StringBuffer(getString).reverse());
                try {
                    synchronized (storageStrings.getMonitor()){
                        storageStrings.getMonitor().wait();
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        }
    }
}
