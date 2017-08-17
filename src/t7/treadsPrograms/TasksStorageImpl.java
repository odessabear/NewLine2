package t7.treadsPrograms;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * Created by X501A on 17.08.2017.
 */
public class TasksStorageImpl implements TasksStorage {
    public LinkedList<Task> array = new LinkedList<>();

    @Override
    public void add(Task task) throws NullPointerException {
        array.add(task);

    }

    @Override
    public Task get() {
        if (array.isEmpty()) {
            return null;
        } else {
            return (Task) array.removeFirst();
        }
    }

    @Override
    public int count() {
        int counter = array.size();
        return counter;
    }
}
