package lv.tsi.practice1.exercise3;

import java.util.Arrays;
import java.util.Random;

public class OneDimensionalArray {

    public static void main(String[] args) {
        OneDimensionalArray oneDimensionalArray = new OneDimensionalArray();

        double[] array = oneDimensionalArray.createRandomArray(5);

        oneDimensionalArray.print(array);

        System.out.println("Average: " + oneDimensionalArray.average(array));
        System.out.println("Maximum: " + Arrays.stream(array).max().getAsDouble());
        System.out.println("Minimum: " + Arrays.stream(array).min().getAsDouble());
    }

    public double[] createRandomArray(int size) {
        Random random = new Random();
        double[] arr = new double[size];

        for (int i = 0; i < size; i++) {
            arr[i] = random.nextDouble() * 100;
        }

        return arr;
    }

    public double average(double[] array) {
        double average = 0;
        int count = 0;

        for (double number : array) {
            average += number;
            count++;
        }

        return average / count;
    }

    public void print(double[] array) {
        System.out.println("Array: ");
        for (double n : array) {
            System.out.print(n + "\t");
        }
        System.out.println();
    }
}
