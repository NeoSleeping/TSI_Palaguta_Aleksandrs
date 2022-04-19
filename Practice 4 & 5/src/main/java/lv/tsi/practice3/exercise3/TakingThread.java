package lv.tsi.practice3.exercise3;

import java.util.concurrent.BlockingQueue;

public class TakingThread extends Thread{

    private final BlockingQueue<String> blockingQueue;

    public TakingThread(BlockingQueue<String> blockingQueue) {
        this.blockingQueue = blockingQueue;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        while (blockingQueue.size() != 0) {
            try {
                System.out.println(blockingQueue.take());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
