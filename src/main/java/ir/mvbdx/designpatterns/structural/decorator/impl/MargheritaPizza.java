package ir.mvbdx.designpatterns.structural.decorator.impl;

public class MargheritaPizza extends Pizza {
    @Override
    public String getDescription() {
        return "Margherita";
    }

    @Override
    public int getCost() {
        return 150;
    }
}
