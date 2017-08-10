package t6;

import java.io.*;

/**
 * Created by X501A on 10.08.2017.
 */
public class MainReader {
    public static void main(String[] args) {
        //Вводить строки с клавиатуры и записывать их в файл на диске.
        PrintWriter out = null;
        BufferedReader in = null;
        try {
            // Создаем буферизованный  символьный входной поток
            in = new BufferedReader(
                    new InputStreamReader(System.in));
            // Используем класс PrintWriter для вывода

            try {
                out = new PrintWriter(new FileWriter("data.txt"));
            } catch (IOException e) {
                e.printStackTrace();
            }
            // Записываем строки, пока не введем строку "stop"
            while (true) {
                String s = in.readLine();
                if (s.equals("stop"))
                    break;
                out.println(s);
            }
            ;
        } catch (IOException ex) {
            // Обработать исключение
        } finally {
            try {
                in.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            if (out != null) {
                out.flush(); //освобождаем буфер (принудительно записываем содержимое буфера в файл)
                out.close(); //закрываем поток записи (обязательно!)
            }
        }


    }
}
