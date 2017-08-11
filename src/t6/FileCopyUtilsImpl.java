package t6;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import java.nio.file.Files;
import java.nio.file.Paths;

public class FileCopyUtilsImpl implements FileCopyUtils {

    @Override
    public void copyFile(String source, String destination) throws IOtheme.FileCopyFailedException {
        try {
            FileInputStream fread = new FileInputStream(new File(source));
            FileOutputStream fwrite = new FileOutputStream(new File(destination));
            int b = 0;
            do {
                fwrite.write(fread.read());
            } while  ((b = fread.read()) != -1);
            fread.close();
            fwrite.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void copyFileUsingJava8(String source, String destination) throws IOException {
        Files.copy(Paths.get(source), Paths.get(destination));
    }
}
