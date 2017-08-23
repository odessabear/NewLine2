package t7.treadsPrograms;

/**
 * Created by X501A on 19.08.2017.
 */
public class TaskExecutorImpl extends Thread implements TaskExecutor {

    private static final int MAX_TASK_RETRIES = 4;

    private TasksStorage storage;
    @Override
    public void setStorage(TasksStorage storage) throws NullPointerException {
        this.storage = storage;
    }

    @Override
    public TasksStorage getStorage() {

        return storage;
    }


    @Override
    public void run() {
        while (storage.count() != 0) {
            Task task = storage.get();
            try {
                task.execute();
            } catch (TaskExecutionFailedException e) {
                e.printStackTrace();
                int trycount = task.getTryCount();
                if (trycount < MAX_TASK_RETRIES){
                    task.incTryCount();
                    storage.add(task);
                }else{
                    throw new IllegalArgumentException("Task retry count has exceeded limit, which is " + MAX_TASK_RETRIES + " retries");
                }
            }
        }

    }

    private String prettifyStacktrace(StackTraceElement[] stacktrace) {
        StringBuffer s = new StringBuffer();
        for (StackTraceElement ste : stacktrace) {
            s.append(ste.toString());
        }
        return s.toString();
    }
}
