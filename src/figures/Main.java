package figures;

/**
 * Created by X501A on 08.07.2017.
 */
public class Main {
    public static void main(String[] args) {
        Figura t1 = new Triangle(2, 3, 2);
        Figura t2 = new Triangle(2, 3, 2);
        Figura t4 = new Triangle(2, 3, 2);
        Figura t3 = new EqualTriangle(3);
        Figura t5 = new EqualTriangle(3);

        Figura[] figuras = {t1, t2, t3, t4, t5};
        for (int i = 0; i < figuras.length; i++) {
            figuras[i].printToconsol();
        }
    }
}
