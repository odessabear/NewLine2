package t6;



import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

/**
 * Created by alexander.mikhailov on 16.08.2017.
 */
public class FileCopyWithJava7 implements FileCopyUtils{


    @Override
    public void copyFile(String source, String destination) throws FileCopyFailedException, FileAlreadyExistsException {
        try {
            Files.copy(Paths.get(source), Paths.get(destination), StandardCopyOption.REPLACE_EXISTING);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
