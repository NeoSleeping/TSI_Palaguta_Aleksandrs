package lv.tsi.practice1.exercise1;

public class GravityCalculator {
    public static final double GRAVITY = 9.8;
    private int fallingTime;
    private double initialPosition;
    private double initialVelocity;

    public static void main(String[] args) {
        GravityCalculator gravityCalculator = new GravityCalculator();

        gravityCalculator.fallingTime = (args.length >= 1 && args[0] != null) ? Integer.parseInt(args[0]) : 0;
        gravityCalculator.initialPosition = (args.length >= 2 && args[1] != null) ? Double.parseDouble(args[1]) : 0;
        gravityCalculator.initialVelocity = (args.length >= 3 && args[2] != null) ? Double.parseDouble(args[2]) : 0;

        double finalPosition = gravityCalculator.calculate();

        System.out.println("Position in " + gravityCalculator.fallingTime + " seconds: " + finalPosition);
    }

    public double calculate() {
        return (fallingTime * fallingTime) * GRAVITY * 0.5 + (initialVelocity * fallingTime) + initialPosition;
    }
}
