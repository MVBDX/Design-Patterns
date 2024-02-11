package ir.mvbdx.designpatterns.structural.decorator.impl;

public class FarmHousePizza extends Pizza {
    @Override
    public String getDescription() {
        return "FarmHouse";
    }

    @Override
    public int getCost() {
        return 200;
    }
}
