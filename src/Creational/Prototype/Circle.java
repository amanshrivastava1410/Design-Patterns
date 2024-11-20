package Creational.Prototype;

public class Circle extends Shape {
    private int radius;

    public Circle(String color, int radius) {
        super(color);
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public Prototype clone() {
        return new Circle(getColor(), radius);
    }

    @Override
    public String toString() {
        return "Circle{color = '" + getColor() + "', radius = " + radius + "}";
    }
}
