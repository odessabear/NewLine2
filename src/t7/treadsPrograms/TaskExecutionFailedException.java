package t7.treadsPrograms;

/**
 * Непредвиденные ошибки во время выполнения задачи
 * 
 * @author nedis
 * @version 1.0
 */
public class TaskExecutionFailedException extends Exception {

	public TaskExecutionFailedException(String message) {
		super(message);
	}

	public TaskExecutionFailedException(Throwable cause) {
		super(cause);
	}

	public TaskExecutionFailedException(String message, Throwable cause) {
		super(message, cause);
	}

}
