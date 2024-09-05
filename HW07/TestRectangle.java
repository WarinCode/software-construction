package HW07;
import java.util.Scanner;
import HW07.Rectangle;

public class TestRectangle {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        Rectangle rectangle = new Rectangle();

        System.out.print("Enter width:");
        rectangle.setWidth(sc.nextInt());
        System.out.print("Enter height:");
        rectangle.setHeight(sc.nextInt());

        rectangle.calculateArea();
        int result = rectangle.getArea();

        System.out.printf("The result of area of the rectangle is %d \n", result);
    }
}
