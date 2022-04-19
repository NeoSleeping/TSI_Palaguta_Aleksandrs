package lv.tsi.practice3.exercise4;

public class Producer extends Thread {

    private final Goods goods;

    public Producer(Goods goods) {
        this.goods = goods;
    }

    @Override
    public void run() {
        int i = 0;
        while (true) {
            goods.produce(i);
            System.out.println("Produced - " + i);
            i++;
        }
    }
}
