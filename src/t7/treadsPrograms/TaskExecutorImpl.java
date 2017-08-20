package t7.treadsPrograms;

/**
 * Created by X501A on 19.08.2017.
 */
public class TaskExecutorImpl extends Thread implements TaskExecutor {
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
        while (true){
            Task task = storage.get();
            if (task == null){
                return;
            }else {
                try {
                    task.execute();
                } catch (TaskExecutionFailedException e) {
                    int trycount = task.getTryCount();
                    if (trycount < 4){
                        task.incTryCount();
                        storage.add(task);
                    }else{
                        System.out.println("can't execute this task");
                    }
                }
            }
        }
    }
}
