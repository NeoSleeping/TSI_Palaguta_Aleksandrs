package lv.tsi.practice1.exercise5;

import java.util.Random;

public class TwoDimensionalArray {

    public static void main(String[] args) {
        TwoDimensionalArray twoDimensionalArray = new TwoDimensionalArray();

        int size = 5;
        int[][] arr = twoDimensionalArray.createRandomArray(size);

        twoDimensionalArray.print(arr);
        twoDimensionalArray.printAverageValueOfEachColumn(arr);
    }

    public int[][] createRandomArray(int size) {
        Random random = new Random();
        int[][] arr = new int[size][size];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                arr[i][j] = random.nextInt(101);
            }
        }

        return arr;
    }

    public void printAverageValueOfEachColumn(int[][] array) {
        float average;
        int count;

        for (int i = 0; i < array.length; i++) {
            average = 0;
            count = 0;

            for (int[] ints : array) {
                average += ints[i];
                count++;
            }

            System.out.println("Average value of " + (i + 1) + " column is: " + (average / count));
        }
    }

    public void print(int[][] arr){
        for (int[] ints : arr) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(ints[j] + "\t");
            }
            System.out.println();
        }
    }
}
