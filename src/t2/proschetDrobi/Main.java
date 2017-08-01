package t2.proschetDrobi;

import t2.Drob;
import t2.FractionNumber;
import t2.FractionNumberOperationImpl;

import static t2.proschetDrobi.CorrectUtils.*;

/**
 * Created by X501A on 13.07.2017.
 */
public class  Main {
    public static void main(String[] args) {
        System.out.println("Добрый день,какое действие будеим производить");
        String inputLine = ConsolUtils.getTextFromConsol();
        String correctMethod= chekInputMethod(inputLine);

        System.out.println("Введите числитель первой дроби");
        int div1 = ConsolUtils.getNumberFromConsol();
        System.out.println("Введите знаменатель первой дроби");
        int dis1 = ConsolUtils.getNumberFromConsol();


        System.out.println("Введите числитель второй дроби");
        int div2 = ConsolUtils.getNumberFromConsol();
        System.out.println("Введите знаменатель второй дроби");
        int dis2 = ConsolUtils.getNumberFromConsol();

        Drob drob1= new Drob(div1,dis1);
        Drob drob2= new Drob(div2,dis2);


        FractionNumberOperationImpl droboper = new FractionNumberOperationImpl();

        if (correctMethod.equals("+")) {
            System.out.println("Результат сложения равен " + droboper.add(drob1, drob2).toString());
        }else if(correctMethod.equals("-")){
            try {
                System.out.println("Результат вычитания равен " + droboper.sub(drob1,drob2).toString());
            }catch (NullPointerException e){
                System.out.println(e.getMessage());
            }

        }else if(correctMethod.equals("*")){
            System.out.println("Результат  умножение равен " + droboper.mul(drob1,drob2).toString());
        }else if(correctMethod.equals("/")){
            System.out.println("Результат деления дробей равен " + droboper.div(drob1,drob2).toString());
        }
    }
}
