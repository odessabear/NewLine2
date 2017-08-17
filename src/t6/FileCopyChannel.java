package t6;



import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * Created by alexander.mikhailov on 16.08.2017.
 */
public class FileCopyChannel implements FileCopyUtils {


    @Override
    public void copyFile(String source, String destination) throws FileCopyFailedException, FileAlreadyExistsException {

        try {
            FileChannel fread = new FileInputStream(source).getChannel();
            FileChannel fwrite = new FileOutputStream(destination).getChannel();
            ByteBuffer buffer = ByteBuffer.allocate(1024);
            while (fread.read(buffer) != -1) {
                buffer.flip(); // Подготовим для записи
                fwrite.write(buffer);
                buffer.clear(); // Подготовим для чтения
            }
        } catch (IOException e) {
            System.err.println("could not copy file");
        }

    }
}




