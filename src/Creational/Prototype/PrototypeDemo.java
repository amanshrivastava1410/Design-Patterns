package Creational.Prototype;

public class PrototypeDemo {
    public static void main(String[] args) {
        Circle origCircle = new Circle("Red", 10);
        Rectangle origRectangle = new Rectangle("Blue", 5, 8);

        Circle clonedCircle = (Circle) origCircle.clone();
        Rectangle clonedRectangle = (Rectangle) origRectangle.clone(); 
        
        System.out.println("Original Circle: " + origCircle);
        System.out.println("Cloned Circle: " + clonedCircle);

        System.out.println("Original Rectangle: " + origRectangle);
        System.out.println("Cloned Rectangle: " + clonedRectangle);
    }
}
