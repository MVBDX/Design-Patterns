package ir.mvbdx.designpatterns.behavioral.strategy.calculation;

public class Multiply implements CalculateStrategy {
    @Override
    public double compute(double number1, double number2) {
        return number1 * number2;
    }
}
