package Creational.Prototype;

public abstract class Shape implements Prototype {
    private String color;

    public Shape(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public abstract Prototype clone();

    @Override
    public String toString() {
        return "Shape{color='" + color + "'}";
    }
}
