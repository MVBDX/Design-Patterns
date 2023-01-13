package ir.mvbdx.designpatterns.creational.prototype.shapes;

public class Circle extends Shape {
    private int radius;

    public Circle(int x, int y, String color, int radius) {
        this.x = x;
        this.y = y;
        this.color = color;
        this.radius = radius;
    }

    public Circle() {}

    public Circle(Circle target) {
        super(target);
        if (target != null) {
            this.radius = target.radius;
        }
    }

    @Override
    public Shape clone() {
        return new Circle(this);
    }

    @Override
    public boolean equals(Object object2) {
        if (!(object2 instanceof Circle) || !super.equals(object2)) return false;
        return ((Circle) object2).radius == radius;
    }

    @Override
    public String toString() {
        return "Circle{" + "radius=" + radius + ", x=" + x + ", y=" + y + ", color='" + color + '\'' + '}';
    }
}
