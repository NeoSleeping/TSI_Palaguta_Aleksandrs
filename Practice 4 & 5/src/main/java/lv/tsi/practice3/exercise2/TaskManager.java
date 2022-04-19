package lv.tsi.practice3.exercise2;


public class TaskManager {

    public synchronized void performTask(int taskId) {
        System.out.println(Thread.currentThread().getName() + " " + taskId);
        try {
            Thread.sleep(4);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + " " + taskId);
    }
}
