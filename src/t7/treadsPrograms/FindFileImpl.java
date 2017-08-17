package t7.treadsPrograms;

import java.io.FileNotFoundException;
import java.io.PrintStream;

/**
 * Created by X501A on 18.08.2017.
 */
public abstract class FindFileImpl implements FindFilesTask{
    @Override
    public void setDirectory(String directory) throws NullPointerException, FileNotFoundException {


    }

    @Override
    public void setFileNameSearchString(String searchString) throws IllegalArgumentException {

    }

    @Override
    public void setPrintStream(PrintStream out) {

    }
}
