package t2.proschetDrobi;

import java.util.Scanner;

/**
 * Created by X501A on 13.07.2017.
 */
public class ConsolUtils {
    public static String getTextFromConsol() {
        Scanner in = new Scanner(System.in);
        String inputLine = in.nextLine();
        return inputLine;
    }

    public static int getNumberFromConsol() {
        String inputNumber = getTextFromConsol();
        try {
            int num = Integer.parseInt(inputNumber);
            return num;
        } catch (NumberFormatException e) {
            System.out.println("Неверно введено число.Повторите ввод");
            return getNumberFromConsol();
        }
    }
}
