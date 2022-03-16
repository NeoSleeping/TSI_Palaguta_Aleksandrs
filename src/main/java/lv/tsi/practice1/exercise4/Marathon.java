package lv.tsi.practice1.exercise4;

public class Marathon {

    private final String[] names = new String[]{
            "Elena", "Thomas", "Hamilton", "Suzie", "Phil", "Matt", "Alex",
            "Emma", "John", "James", "Jane", "Emily", "Daniel", "Neda", "Aaron", "Kate"
    };

    private final int[] times = new int[]{
            341, 273, 278, 329, 445, 402, 388, 275, 243, 334, 412, 393, 299,
            343, 317, 265
    };

    public static void main(String[] args) {
        Marathon marathon = new Marathon();
        marathon.printResults(marathon.names, marathon.times);
    }

    public void printResults(String[] names, int[] time) {
        for (int i = 0; i < names.length; i++) {
            System.out.println("Name: " + names[i] + " - Time: " + time[i] + "s");
        }
    }
}
