package t7.treadsPrograms;

import t6.FileCopyUtils;

/**
 * Created by X501A on 15.08.2017.
 */
public class CopyFileImpl extends AbstractTask implements CopyFileTask {

    private String pathFrom;
    private String pathTo;
    private FileCopyUtils copyUtils;

    public CopyFileImpl(String pathFrom, String pathTo, FileCopyUtils copyUtils) {
        this.pathFrom = pathFrom;
        this.pathTo = pathTo;
        this.copyUtils = copyUtils;

    }

    @Override
    public void setFileCopyUtils(FileCopyUtils copyUtils) {
        this.copyUtils = copyUtils;

    }

    @Override
    public void execute() throws TaskExecutionFailedException {
        try {
            copyUtils.copyFile(pathFrom, pathTo);
        } catch (Exception e) {
           throw new TaskExecutionFailedException(e.getMessage());
        }

    }
}
