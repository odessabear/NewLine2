package t7.treadsPrograms;

import java.io.InterruptedIOException;
import java.io.PrintStream;

/**
 * Created by alexander.mikhailov on 25.08.2017.
 */
public class NamePrinterImpl implements NamePrinter {

    private String name;
    private long interval;
    private int count;
    private PrintStream stream;

    @Override
    public void setPrintName(String name) throws NullPointerException, IllegalArgumentException {
        if (name == null) {
            throw new NullPointerException("name is null");
        } else if (name.length() == 0) {
            throw new IllegalArgumentException("name length is 0");
        } else {
            this.name = name;
        }
    }

    @Override
    public void setStream(PrintStream stream) throws NullPointerException {
        if (stream == null) {
            throw new NullPointerException("stream is null");
        } else{
            this.stream = stream;
        }
    }

    @Override
    public void setInterval(long interval) throws IllegalArgumentException {
        checkIfIsZero(interval);
        this.interval = interval;
    }

    @Override
    public void setCount(int count) throws IllegalArgumentException {
        checkIfIsZero(count);
        this.count = count;
    }

    public void print() {
        for (int i = 0; i < count; i++) {
            try {
                Thread.sleep(this.interval);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            this.stream.println("I am thread with name [" + this.name + "]");
        }
    }

    private void checkIfIsZero(long value) {
        if (value == 0L) throw new IllegalArgumentException("long value is 0L");
    }
}
