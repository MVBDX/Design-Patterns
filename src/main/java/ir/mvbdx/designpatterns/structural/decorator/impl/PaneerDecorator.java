package ir.mvbdx.designpatterns.structural.decorator.impl;

public class PaneerDecorator extends Pizza {
    private Pizza pizza;

    public PaneerDecorator(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + " + Paneer";
    }

    @Override
    public int getCost() {
        return pizza.getCost() + 35;
    }
}
