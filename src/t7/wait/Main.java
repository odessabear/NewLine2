package t7.wait;

/**
 * Created by X501A on 15.08.2017.
 */
public class Main {
    public static void main(String[] args) {
        Thread inputThread = new Thread(new InputThread());
        Thread outputThread = new Thread(new OutputThread());
        inputThread.start();
        outputThread.start();

        Thread afterInput1 = new Thread(new AfterInputThread());
        Thread afterInput2 = new Thread(new AfterInputThread());
        Thread afterInput3 = new Thread(new AfterInputThread());

        afterInput1.start();
        afterInput2.start();
        afterInput3.start();
    }
}
