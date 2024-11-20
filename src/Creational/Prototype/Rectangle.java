package Creational.Prototype;

public class Rectangle extends Shape {
    private int width;
    private int height;

    public Rectangle(String color, int width, int height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public Prototype clone() {
        return new Rectangle(getColor(), width, height);
    }

    @Override
    public String toString() {
        return "Rectangle{color = '" + getColor() + "', width = " + width + ", height = " + height + "}";
    }
}
