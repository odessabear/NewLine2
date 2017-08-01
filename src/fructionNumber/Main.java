package fructionNumber;

/**
 * Created by X501A on 06.07.2017.
 */
public class Main {
    public static void main(String[] args) {
        FructionNumber num1 = new FructionNumber(4,3);
        FructionNumber num2 = new FructionNumber(1,5);
        num1.setDivident(2);
        num2.setDivisor(7);
        int div2 = num2.getDivident();
        System.out.println(div2);
        num1.printToconsol();
        num2.printToconsol();

        FructionNumbersOperations utils = new FructionNumbersOperations();
        FructionNumber result = utils.add(num1,num2);
        result.printToconsol();
    }
}
