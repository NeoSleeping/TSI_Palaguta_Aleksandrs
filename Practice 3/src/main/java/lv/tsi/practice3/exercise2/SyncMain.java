package lv.tsi.practice3.exercise2;


public class SyncMain {

    public static void main(String[] args) {
        final TaskManager taskManager = new TaskManager();

        TaskThread taskThread = new TaskThread("TaskThread1", taskManager, 1);
        TaskThread taskThread2 = new TaskThread("TaskThread2", taskManager, 2);

        taskThread.start();
        try {
            Thread.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        taskThread2.start();
    }
}
