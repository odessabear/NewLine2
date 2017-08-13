package t6.serislizable;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * Created by X501A on 12.08.2017.
 */
public class Serializathion {
    public static void main(String[] args) {

        try {
            ObjectOutputStream ois = new ObjectOutputStream(new FileOutputStream("state.bin"));
            ois.writeDouble(3.14159265D);
            ois.writeObject("The value of PI");
            ois.writeObject(new Point(10,253)); //запись объекта класса Point
            ois.flush();
            ois.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
