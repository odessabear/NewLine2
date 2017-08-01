package fructionNumber;

/**
 * Created by X501A on 06.07.2017.
 */
public class FructionNumbersOperations {



    public FructionNumber add(FructionNumber num1,FructionNumber num2){
        int dis1 = num1.getDivisor();
        int div1 = num1.getDivident();
        int div2 = num2.getDivident();
        int dis2 = num2.getDivisor();
        int resdivident = div1*dis2 + div2*dis1;
        int resdivisor = dis1*dis2;
        FructionNumber result = new FructionNumber(resdivident,resdivisor);
        return result;
    }
    public FructionNumber ded(FructionNumber dednum1,FructionNumber dednum2){
        int dis1 = dednum1.getDivisor();
        int div1 = dednum1.getDivident();
        int div2 = dednum2.getDivident();
        int dis2 = dednum2.getDivisor();
        int resdivident = div1*dis2 - div2*dis1;
        int resdivisor = dis1*dis2;
        FructionNumber dresult = new FructionNumber(resdivident,resdivisor);
        return  dresult;
    }
    public FructionNumber increase (FructionNumber incnum1,FructionNumber incnum2){
        int div1 = incnum1.getDivident();
        int dis1 = incnum1.getDivisor();
        int div2 = incnum2.getDivident();
        int dis2 = incnum2.getDivisor();
        int resdivident = div1*div2;
        int resdevisor = dis1*dis2;
        FructionNumber incresult = new FructionNumber(resdivident,resdevisor);
        return incresult;
    }
   public FructionNumber division (FructionNumber divnum1,FructionNumber divnum2){
       int div1 = divnum1.getDivident();
       int dis1 = divnum1.getDivisor();
       int div2 = divnum2.getDivident();
       int dis2 = divnum2.getDivisor();
       int resdivident = div1*dis2;
       int resdivisor = dis1*div2;
       FructionNumber divresult = new FructionNumber(resdivident,resdivisor);
       return  divresult;
   }

}
