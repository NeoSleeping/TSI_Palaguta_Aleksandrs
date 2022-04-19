package lv.tsi.practice1.exercise2;

public class FactorialCalculator {

    public static void main(String[] args) {
        FactorialCalculator factorialCalculator = new FactorialCalculator();
        int number = 10;

        System.out.println("Factorial(using for loop) of " + number + " is: " + factorialCalculator.factorial(number));
        System.out.println("Factorial(using recursion) of " + number + " is: " + factorialCalculator.factorialRecursion(number));
    }

    public int factorial(int number) {
        int n = 1;
        for (int i = 1; i <= number; i++) {
            n = n * i;
        }
        return n;
    }

    public int factorialRecursion(int number) {
        if (number == 0) {
            return 1;
        }
        return number * factorialRecursion(number - 1);
    }
}
