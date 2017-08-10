package t6;

import java.io.*;

/**
 * Created by X501A on 06.08.2017.
 */
public class IOtheme {
        public static void main(String[] args) {
            BufferedInputStream bis = null;
            BufferedOutputStream bos = null;
            try {
                bis = new BufferedInputStream(new FileInputStream("D:\\Фото\\ОДЕССА\\P1280743.jpg"));
                bos = new BufferedOutputStream(new FileOutputStream("zweite.jpg"));

                int c = 0;
                while (true) {
                    c = bis.read();
                    if (c != -1)
                        bos.write(c);
                    else
                        break;
                }

            }
            catch (java.io.IOException e) {
                System.out.println(e.toString());
            } finally {
                try {
                    bis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                if (bos != null){
                    try {
                        bos.flush(); //освобождаем буфер (принудительно записываем содержимое буфера в файл)
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    try {
                        bos.close(); //закрываем поток записи (обязательно!)
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        }

    /**
     * Если копирование файла завершилось неудачей будет выброшено данное исключение
     *
     * @author nedis
     * @version 1.0
     */
    public static class FileCopyFailedException extends Exception {
        private static final long serialVersionUID = 1433646159143681180L;

        public FileCopyFailedException(String message) {
            super(message);
        }

        public FileCopyFailedException(String message, Throwable cause) {
            super(message, cause);
        }

    }
}
