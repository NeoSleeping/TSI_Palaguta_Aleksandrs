package lv.tsi.practice3.exercise4;


public class Goods {

    private int amount;
    private volatile boolean transfer = true;

    public synchronized void produce(int amount) {
        while (amount < 0) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        transfer = false;
        notify();
    }

    public synchronized int consume() {
        while (transfer) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        transfer = false;
        notify();
        return amount;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public boolean isTransfer() {
        return transfer;
    }

    public void setTransfer(boolean transfer) {
        this.transfer = transfer;
    }
}
