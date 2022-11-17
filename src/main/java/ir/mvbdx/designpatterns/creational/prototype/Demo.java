package ir.mvbdx.designpatterns.creational.prototype;

import ir.mvbdx.designpatterns.creational.prototype.shapes.Circle;

public class Demo {
    public static void main(String[] args) {
        var circle1 = new Circle(10, 20, "green", 5);

        var circle2 = (Circle) circle1.clone();

        System.out.println(circle2.toString());
    }
}
