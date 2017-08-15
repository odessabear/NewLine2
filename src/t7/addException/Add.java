package t7.addException;

/**
 * Created by X501A on 15.08.2017.
 */
public class Add extends Thread{
    @Override
    public void run() {
        for (int i =0; i< Long.MAX_VALUE; i++){
            Storage.add(i);
        }
    }
}
