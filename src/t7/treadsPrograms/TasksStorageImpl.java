package t7.treadsPrograms;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

/**
 * Created by X501A on 17.08.2017.
 */
public class TasksStorageImpl implements TasksStorage {
    private Queue<Task> taskQueue = new ConcurrentLinkedQueue<>();

    @Override
    public synchronized void add(Task task) throws NullPointerException {
        if (task == null) {
            throw new NullPointerException("Task can't be null");
        }
        taskQueue.offer(task);
    }

    @Override
    public synchronized Task get() {

        Task task = taskQueue.poll();
        if (task != null) {
            return task;
        } else {
            throw new IllegalArgumentException("No tasks are present in taskQueue");
        }

    }

    @Override
    public synchronized int count() {
        int counter = taskQueue.size();
        return counter;
    }
}
