package t7.treadsPrograms;

/**
 * Created by X501A on 15.08.2017.
 */
public abstract class AbstractTask implements Task {
    private int tryCount = 0;

    @Override
    public int getTryCount() {

        return tryCount;
    }

    @Override
    public void incTryCount() {
        tryCount++;

    }


}
