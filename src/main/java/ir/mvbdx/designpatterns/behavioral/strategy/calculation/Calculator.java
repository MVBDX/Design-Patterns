package ir.mvbdx.designpatterns.behavioral.strategy.calculation;

public class Calculator {
    private CalculateStrategy strategy;

    public void setStrategy(CalculateStrategy strategy) {
        this.strategy = strategy;
    }

    public double calculate(double number1, double number2) {
        return strategy.compute(number1, number2);
    }
}
