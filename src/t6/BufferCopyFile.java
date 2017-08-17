package t6;



import java.io.*;

/**
 * Created by alexander.mikhailov on 16.08.2017.
 */
public class BufferCopyFile implements FileCopyUtils{

    @Override
    public void copyFile(String source, String destination) throws FileCopyFailedException, FileAlreadyExistsException {
        try {
            File dst = new File(destination);
            dst.delete();
            dst.createNewFile();
            BufferedInputStream fread = new BufferedInputStream(new FileInputStream(source));
            BufferedOutputStream fwrite = new BufferedOutputStream(new FileOutputStream(String.valueOf(dst)));

            int c = 0;
            while (true) {
                c = fread.read();
                if (c != -1)
                    fwrite.write(c);
                else
                    break;
            }
            fread.close();
            fwrite.flush();
            fwrite.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
