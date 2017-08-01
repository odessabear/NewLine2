package fructionNumber;

/**
 * Created by X501A on 06.07.2017.
 */
public class FructionNumber {
    private int divident;
    private int divisor;

    public FructionNumber() {

    }

    public FructionNumber(int div, int dis) {
        divident = div;
        divisor = dis;
    }

    public void setDivident(int div) {
        divident = div;
    }

    public void setDivisor(int dis) {
        divisor = dis;

    }

    public int getDivident() {
        return divident;
    }

    public int getDivisor() {
        return divisor;
    }

    public void printToconsol() {
        System.out.println(divident + "/" + divisor);
    }

    public void sokracshenie() {
        boolean isDivMinus = (divident>0)?false:true;
        boolean isDisMinus = (divisor>0)?false:true;
        if (isDivMinus){
            divident = - divident;
        }
        if (isDisMinus){
            divisor = - divisor;
        }
        int min = (divident > divisor) ? divisor : divident;
        int delimoe = 1;
        for (int i = 2;i <= min;i++){
            if ((divident%i == 0)&&(divisor%1==0)){
                delimoe = i;
            }
        }
        divident = divident/delimoe;
        divisor = divisor/delimoe;
        if (isDivMinus){
            divident = - divident;
        }
        if (isDisMinus){
            divisor = - divisor;
        }

    }
}
