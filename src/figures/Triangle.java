package figures;

/**
 * Created by X501A on 08.07.2017.
 */
public class Triangle implements Figura {
    private int a;
    private int b;
    private int c;

    public Triangle(){
        super();
    }

    public Triangle(int side1, int side2, int side3) {
        super();
        a = side1;
        b = side2;
        c = side3;
    }


    @Override
    public int square() {
        return 0;
    }

    @Override
    public int perimetr() {
        return 0;
    }

    @Override
    public void printName() {

    }

    @Override
    public void printToconsol() {
        System.out.println("Triangle sides is " + a + " " + b + " " + c);
    }
    public int getSide1(){
        return a;
    }

    @Override
    public String toString() {
        return "Triangle -------- " + a + " " + b + " " + c;
    }
}
