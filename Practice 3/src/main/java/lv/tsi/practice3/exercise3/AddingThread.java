package lv.tsi.practice3.exercise3;

import java.util.concurrent.BlockingQueue;

public class AddingThread extends Thread {

    private final BlockingQueue<String> queue;

    public AddingThread(BlockingQueue<String> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            try {
                queue.put("Element " + i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("The element " + i + " was added");
        }
    }
}
