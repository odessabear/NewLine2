package t7.treadsPrograms;


import org.apache.log4j.Logger;

/**
 * Created by X501A on 19.08.2017.
 */
public class TaskExecutorImpl extends Thread implements TaskExecutor {
    public static final Logger LOGGER = Logger.getLogger(TaskExecutorImpl.class);

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
        while (true) {
            Task task = storage.get();
            if (task != null) {
                LOGGER.debug(Thread.currentThread().getName() + "--------- get task on storage: " + task);
                try {
                    System.out.println(Thread.currentThread().getName() + "--------- start to execute task: " + task);
                    task.execute();
                    System.out.println(Thread.currentThread().getName() + "------++++++++--- Task executed succesfull: " + task);
                } catch (TaskExecutionFailedException e) {
                    System.out.println(Thread.currentThread().getName() + "--------- can't execute task : " + task);
                    int trycount = task.getTryCount();
                    System.out.println(Thread.currentThread().getName() + "--------- Trying of execute task is : " + task.getTryCount());
                    if (trycount < MAX_TASK_RETRIES) {
                        System.out.println(Thread.currentThread().getName() + "--------- Add this task to task storrage again: " + task);
                        task.incTryCount();
                        storage.add(task);
                    } else {
                        System.out.println(Thread.currentThread().getName() + "--------- Uncorrect task? i'll delete this tsak: " + task);
                    }
                }
            } else {
                System.out.println(Thread.currentThread().getName() + "--------- Can't find task on storage. I'm stoping");
                return;
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
