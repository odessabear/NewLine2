package figures;

/**
 * Created by X501A on 08.07.2017.
 */
public class FiveSide extends MoreThen4Sides{
    private int a;
    private int b;
    private int c;
    private int d;
    private int f;
    public FiveSide(int a,int b,int c,int d, int f){
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.f = f;
    }
    @Override
    public int square() {
        return 0;
    }

    @Override
    public int perimetr() {

        return a + b + c + d + f;
    }

    @Override
    public void printToconsol() {

    }

    @Override
    public void uuuuuuuuu() {

    }
}
