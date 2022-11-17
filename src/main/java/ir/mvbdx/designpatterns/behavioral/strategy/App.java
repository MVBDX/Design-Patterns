package ir.mvbdx.designpatterns.behavioral.strategy;

import ir.mvbdx.designpatterns.behavioral.strategy.calculation.Addition;
import ir.mvbdx.designpatterns.behavioral.strategy.calculation.Calculator;
import ir.mvbdx.designpatterns.behavioral.strategy.calculation.Multiply;

public class App {
    public static void main(String[] args) {
        double num1 = 2.3d;
        double num2 = 5.4d;

        Calculator calculator = new Calculator();

        calculator.setStrategy(new Multiply());
        System.out.printf("Multiply of %f and %f is %f%n", num1, num2, calculator.calculate(num1, num2));

        calculator.setStrategy(new Addition());
        System.out.printf("Addition of %f and %f is %f%n", num1, num2, calculator.calculate(num1, num2));

    }
}
