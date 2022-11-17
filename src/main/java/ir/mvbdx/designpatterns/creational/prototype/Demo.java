package ir.mvbdx.designpatterns.creational.prototype;

import ir.mvbdx.designpatterns.creational.prototype.shapes.Circle;

public class Demo {
    public static void main(String[] args) {
        Circle circle1 = new Circle(10, 20, "green", 5);

        Circle circle2 = (Circle) circle1.clone();

        System.out.println(circle2.toString());
    }
}
