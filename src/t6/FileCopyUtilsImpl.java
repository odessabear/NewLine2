package t6;

import java.io.*;

import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class FileCopyUtilsImpl implements FileCopyUtils {

    @Override
    public void copyFile(String source, String destination) throws IOtheme.FileCopyFailedException {
        try {
            FileReader fread = new FileReader(new File(source));
            FileWriter fwrite = new FileWriter(new File(destination));
            int b = 0;
            do {
                fwrite.write(fread.read());
            } while  ((b = fread.read()) != -1);
            fread.close();
            fwrite.flush();
            fwrite.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void copyFileOverwrite(String source, String destination) throws IOtheme.FileCopyFailedException, FileAlreadyExistsException {
        try {
            File dst = new File(destination);
            dst.delete();
            dst.createNewFile();
            FileReader fread = new FileReader(new File(source));
            FileWriter fwrite = new FileWriter(new File(String.valueOf(dst)));
            int b = 0;
            do {
                fwrite.write(fread.read());
            } while  ((b = fread.read()) != -1);
            fread.close();
            fwrite.flush();
            fwrite.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void copyFileBuffer(String source, String destination) throws IOtheme.FileCopyFailedException, FileAlreadyExistsException {
        try {
            File dst = new File(destination);
            dst.delete();
            dst.createNewFile();
            FileReader fread = new FileReader(new File(source));
            FileWriter fwrite = new FileWriter(new File(String.valueOf(dst)));;
            int b = 0;
            do {
                fwrite.write(fread.read());
            } while  ((b = fread.read()) != -1);
            fread.close();
            fwrite.flush();
            fwrite.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void copyFileChannel(String source, String destination) throws IOtheme.FileCopyFailedException, FileAlreadyExistsException {
        try {
            FileChannel fread = new FileInputStream(source).getChannel();
            FileChannel Fwrite = new FileOutputStream(destination).getChannel();


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void copyFileUsingJava8(String source, String destination) throws IOException {
        Files.copy(Paths.get(source), Paths.get(destination));
    }

    @Override
    public void copyFileUsingJava8Overwrite(String source, String destination) throws IOtheme.FileCopyFailedException, FileAlreadyExistsException, IOException {
        Files.copy(Paths.get(source), Paths.get(destination), StandardCopyOption.REPLACE_EXISTING);
    }
}
