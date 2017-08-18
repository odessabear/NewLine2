package t7.treadsPrograms;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Set;

/**
 * Created by X501A on 18.08.2017.
 */
public abstract class FindFileImpl extends AbstractTask implements FindFilesTask {

    private PrintStream out;
    private String directory;
    private String searchString;

    @Override
    public void setDirectory(String directory) throws NullPointerException, FileNotFoundException {
        this.directory = directory;
    }

    @Override
    public void setFileNameSearchString(String searchString) throws IllegalArgumentException {
        this.searchString = searchString;
    }

    @Override
    public void setPrintStream(PrintStream out) {
        this.out = out;
    }

    @Override
    public void execute() throws TaskExecutionFailedException {

        if (this.directory == null) {
            throw new IllegalArgumentException("i don't know WHERE to search");
        }

        if (this.searchString == null) {
            throw new IllegalArgumentException("i don't know WHAT to search");
        }

        if (this.out == null) {
            throw new IllegalArgumentException("i don't know WHERE TO PRINT THE OUTPUT");
        }

        Set<String> foundEntries = find(searchString, directory);

        if (!foundEntries.isEmpty()) {
            for (String entry: foundEntries) {
                this.out.println("found entry " + entry);
            }
        } else {
            this.out.println("nothing was found");
        }

        this.out.write(Integer.parseInt("something was found"));
    }

    private Set<String> find(String searchString, String directory) {
        return null;
    }
}
