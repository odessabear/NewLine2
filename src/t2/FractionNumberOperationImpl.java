package t2;

import fructionNumber.FructionNumber;

/**
 * Created by X501A on 13.07.2017.
 */
public class FractionNumberOperationImpl implements FractionNumberOperation{

    @Override
    public FractionNumber add(FractionNumber a, FractionNumber b) throws NullPointerException {
        if (a == null){
            throw new NullPointerException("con not be found object a");
        }

        if (b == null){
            throw new NullPointerException("con not be found object b");
        }
        int dis1 = a.getDivisor();
        int div1 = a.getDividend();
        int div2 = b.getDividend();
        int dis2 = b.getDivisor();
        int resdivident = div1*dis2 + div2*dis1;
        int resdivisor = dis1*dis2;
        Drob result = new Drob(resdivident,resdivisor);
        return result;
    }

    @Override
    public FractionNumber sub(FractionNumber a, FractionNumber b) throws NullPointerException {
        int dis1 = a.getDivisor();
        int div1 = a.getDividend();
        int div2 = b.getDividend();
        int dis2 = b.getDivisor();
        int resdivident = div1*dis2 - div2*dis1;
        int resdivisor = dis1*dis2;
        Drob result = new Drob(resdivident,resdivisor);
        return result;
    }

    @Override
    public FractionNumber mul(FractionNumber a, FractionNumber b) throws NullPointerException {
        int dis1 = a.getDivisor();
        int div1 = a.getDividend();
        int div2 = b.getDividend();
        int dis2 = b.getDivisor();
        int resdivident = div1*div2;
        int resdevisor = dis1*dis2;
        Drob result = new Drob(resdivident,resdevisor);
        return result;
    }

    @Override
    public FractionNumber div(FractionNumber a, FractionNumber b) throws NullPointerException, ArithmeticException {
        int dis1 = a.getDivisor();
        int div1 = a.getDividend();
        int div2 = b.getDividend();
        int dis2 = b.getDivisor();
        int resdivident = div1*dis2;
        int resdivisor = dis1*div2;
        Drob result = new Drob(resdivident,resdivisor);
        return result;
    }
}
