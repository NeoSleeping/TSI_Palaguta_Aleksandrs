package lv.tsi.practice3.exercise2;

public class TaskThread extends Thread {

    private final TaskManager taskManager;
    private final int taskId;

    public TaskThread(String name, TaskManager taskManager, int taskId) {
        super(name);
        this.taskManager = taskManager;
        this.taskId = taskId;
    }

    @Override
    public void run() {
        taskManager.performTask(taskId);
    }
}
