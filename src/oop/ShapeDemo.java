package oop;

public class ShapeDemo {
    public static void main(String[] args) {
        Shape[] shape = {new Circle(2), new Rectangle(4, 3), new Circle(10)};
        double totalArea = 0;
        for (Shape s : shape) {
            totalArea += s.area();
        }
        System.out.println("TotalArea: " + totalArea);
    }
}