package lv.tsi.practice3.exercise4;

public class ProducerConsumerMain {

    public static void main(String[] args) {
        Goods goods = new Goods();

        Consumer consumer = new Consumer(goods);
        Producer producer = new Producer(goods);

        producer.start();
        consumer.start();
    }
}
