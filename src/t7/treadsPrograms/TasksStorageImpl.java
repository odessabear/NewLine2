package t7.treadsPrograms;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

/**
 * Created by X501A on 17.08.2017.
 */
public class TasksStorageImpl implements TasksStorage {
    private LinkedList<Task> array = new LinkedList<>();

    @Override
    public synchronized void add(Task task) throws NullPointerException {
        if (task == null){
            throw new NullPointerException("Task can't be null");
        }
        array.add(task);

    }

    @Override
    public synchronized Task get() {
        Task elem = null;
        if (array.isEmpty()) {
            return null;
        } else {
            for (Iterator iter = array.iterator(); iter.hasNext();){
                elem = (Task)iter.next();
            }
                return elem;
        }
    }

    @Override
    public synchronized int count() {
        int counter = array.size();
        return counter;
    }
}
