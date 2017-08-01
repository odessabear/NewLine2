package t2;

/**
 * Created by X501A on 12.07.2017.
 */
public class Drob implements FractionNumber{
    private int divid;
    private int divis = FractionNumber.DEFAULT_DIVISOR_VALUE;


    public Drob(){

    }
    public Drob(int div,int dis ){
        divid = div;
        divis = dis;
    }

    @Override
    public void setDividend(int dividend) {
        divid = dividend;

    }

    @Override
    public int getDividend() {
        return divid;
    }

    @Override
    public void setDivisor(int divisor)  {
        if (divis == 0) throw new IllegalArgumentException(" Вы не можете делить на ноль");
        divis = divisor;
    }

    @Override
    public int getDivisor() {
        return divis;
    }

    private void getDivisor(int divis) {
    }

    @Override
    public double value() {
        double result = (double)divid / divis;
        return result;
    }

    public String toString(){
        return " " + divid + " / " + divis;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Drob drob = (Drob) o;

        if (divid != drob.divid) return false;
        return divis == drob.divis;

    }

    @Override
    public int hashCode() {
        int result = divid;
        result = 31 * result + divis;
        return result;
    }
}
