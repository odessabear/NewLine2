package fructionNumber;

/**
 * Created by X501A on 07.07.2017.
 */
public class Main3 {
    public static void main(String[] args) {
        FructionNumber dednum1 = new FructionNumber(3,4);
        FructionNumber dednum2 = new FructionNumber(6,9);
        dednum1.printToconsol();
        dednum2.printToconsol();

        FructionNumbersOperations dedutils = new FructionNumbersOperations();
        FructionNumber dedresult = dedutils.ded(dednum1,dednum2);
        dedresult.sokracshenie();
        dedresult.printToconsol();

        FructionNumber incresult = dedutils.increase(dednum1,dednum2);
        incresult.printToconsol();

        FructionNumber divresult = dedutils.division(dednum1,dednum2);
        divresult.printToconsol();
    }
}
