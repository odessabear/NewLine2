package t7.treadsPrograms;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by X501A on 19.08.2017.
 */
public class FindFilesTaskImpl extends AbstractTask implements FindFilesTask {
    private String directory;
    private String searchString;
    private PrintStream out;

    @Override
    public void execute() throws TaskExecutionFailedException {
        Set<String> result = new HashSet<>();
        try {
            searchFiles(result,directory,searchString);
        } catch (Exception e) {
            throw new TaskExecutionFailedException("Task can't be execute");
        }

        if (result.isEmpty()) {
            out.println("can't find file with this searchString ");
        } else {
            for (String path : result) {
                out.println(path);
            }
        }


    }


    private void searchFiles(Set<String> result,String path,String searchString){
        File currentDir = new File(path);
       File [] files = currentDir.listFiles();
        for (File file:files){
            if (file.isDirectory()){
                searchFiles(result, file.getAbsolutePath(), searchString);
            }else {
                String nameOffile = file.getName();
                if (nameOffile.indexOf(searchString)!= -1){
                    result.add(file.getAbsolutePath());
                }
            }
        }
    }

    @Override
    public void setDirectory(String directory) throws NullPointerException, FileNotFoundException {
        if (directory == null) {
            throw new NullPointerException("directoy can't be null");
        }

        File path = new File(directory);
        if (!path.exists()) {
            throw new FileNotFoundException("there is no directory on this path");
        }

        this.directory = directory;


    }

    @Override
    public void setFileNameSearchString(String searchString) throws IllegalArgumentException {
        if (searchString == null) {
            throw new IllegalArgumentException("searchString is null");
        }
        this.searchString = searchString;


    }

    @Override
    public void setPrintStream(PrintStream out) {
        this.out = out;

    }
}
