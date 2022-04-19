package lv.tsi.practice3.exercise4;

public class Consumer extends Thread {

    private final Goods goods;

    public Consumer(Goods goods) {
        this.goods = goods;
    }

    @Override
    public void run() {
        int i = 0;
        while (true) {
            goods.consume();
            System.out.println("Consumed - " + i);
            i++;
        }
    }
}
