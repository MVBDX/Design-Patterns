package ir.mvbdx.designpatterns.behavioral.strategy;

import ir.mvbdx.designpatterns.behavioral.strategy.calculation.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, CalculateStrategy> strategyMap = new HashMap<>();
        strategyMap.put("add", new Addition());
        strategyMap.put("div", new Division());
        strategyMap.put("mul", new Multiply());
        strategyMap.put("sub", new Subtraction());

        Calculator calculator = new Calculator();

        System.out.println("Please choose your operation: add / div / mul / sub");
        String operation = scanner.nextLine();
        System.out.println("Please enter your first number:");
        double num1 = scanner.nextDouble();
        System.out.println("Please enter your second number:");
        double num2 = scanner.nextDouble();

        calculator.setStrategy(strategyMap.get(operation));

        System.out.printf("%s of %f and %f is %f%n", operation, num1, num2, calculator.calculate(num1, num2));

    }
}
