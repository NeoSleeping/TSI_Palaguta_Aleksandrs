package lv.tsi.practice3.exercise1;

public class PriorityMain {

    public static void main(String[] args) {
        PriorityThread max = new PriorityThread("MAX");
        PriorityThread norm = new PriorityThread("NORM");
        PriorityThread min = new PriorityThread("MIN");

        max.setPriority(Thread.MAX_PRIORITY);
        norm.setPriority(Thread.NORM_PRIORITY);
        min.setPriority(Thread.MIN_PRIORITY);

        max.start();
        norm.start();
        min.start();
    }
}
