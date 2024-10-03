package HW10.test2;

public class ShapeArray {
    public static double sumArea(Shape[] shapes) {
        double sum = 0;
        for(Shape s : shapes) {
            sum += s.getArea();
        }
        return sum;
    }
}