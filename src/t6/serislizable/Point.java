package t6.serislizable;

import java.io.Serializable;

/**
 * Created by X501A on 12.08.2017.
 */
public class Point implements Serializable{
    private int x=0, y = 0;
    public Point() {}
    public Point(int x, int y) {
        this.x = x; this.y = y;
    }
    public String toString() { return "("+x+","+y+")"; }

}
