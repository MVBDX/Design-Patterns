package ir.mvbdx.designpatterns.structural.decorator.impl;

public class TomatoDecorator extends Pizza {
    private Pizza pizza;

    public TomatoDecorator(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + " + Tomato";
    }

    @Override
    public int getCost() {
        return pizza.getCost() + 25;
    }
}
