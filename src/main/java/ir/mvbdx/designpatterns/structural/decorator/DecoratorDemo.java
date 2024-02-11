package ir.mvbdx.designpatterns.structural.decorator;

import ir.mvbdx.designpatterns.structural.decorator.impl.*;

public class DecoratorDemo {
    public static void main(String[] args) {
        Pizza pizza = new MargheritaPizza();
        System.out.printf("Name: %s, Cost: %s", pizza.getDescription(), pizza.getCost());

        System.out.println("\n====================");

        Pizza pizza2 = new FarmHousePizza();
        pizza2 = new PaneerDecorator(pizza2);
        pizza2 = new TomatoDecorator(pizza2);
        System.out.printf("Name: %s, Cost: %s", pizza2.getDescription(), pizza2.getCost());

    }
}
