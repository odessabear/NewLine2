package t2.proschetDrobi;

/**
 * Created by X501A on 13.07.2017.
 */
public class CorrectUtils {
    public static String chekInputMethod(String inputLine) {
        if (inputLine.equalsIgnoreCase("+") || inputLine.equalsIgnoreCase("-") || inputLine.equalsIgnoreCase("*") || inputLine.equalsIgnoreCase("/")) {
            return inputLine;
        } else {
            System.out.println("Не существует такого метода.Повторите ввод.");
            String inputLine2 = ConsolUtils.getTextFromConsol();
            return chekInputMethod(inputLine2);
        }
    }

    public static int checkCorrectDivisor(int number) {
        if (number == 0) {
            System.out.println("Знаменатель не может быть равен нулю.Повторите ввод.");
            int inputNumber = ConsolUtils.getNumberFromConsol();
            return checkCorrectDivisor(inputNumber);
        }
        return number;
    }

     public static int checkCorrectDivisor() {
         return 0;
     }
}