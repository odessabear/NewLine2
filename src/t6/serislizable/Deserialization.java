package t6.serislizable;

import java.io.IOException;

/**
 * Created by X501A on 12.08.2017.
 */
public class Deserialization  {
    public static void main(String[] args) {
        try {
            java.io.ObjectInputStream ois = new java.io.ObjectInputStream(new java.io.FileInputStream("state.bin"));
            System.out.println("Double: " + ois.readDouble());
            System.out.println("String: " + ois.readObject().toString());
            System.out.println("Point: " + (Point) ois.readObject());
            ois.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
