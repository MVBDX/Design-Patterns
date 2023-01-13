package ir.mvbdx.designpatterns.creational.prototype.shapes;

import java.util.Objects;

public abstract class Shape implements Cloneable {
    protected int x;
    protected int y;
    protected String color;

    public Shape() {}

    public Shape(Shape target) {
        if (target != null) {
            this.x = target.x;
            this.y = target.y;
            this.color = target.color;
        }
    }

    @Override
    public boolean equals(Object object2) {
        if (!(object2 instanceof Shape)) return false;
        return ((Shape) object2).x == x && ((Shape) object2).y == y && Objects.equals(((Shape) object2).color, color);
    }

}
