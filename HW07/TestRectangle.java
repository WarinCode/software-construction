package HW07;
import java.util.Scanner;
import HW07.Rectangle;

public class TestRectangle {
    public static void main(String[] args) {
        Rectangle rec = new Rectangle(10, 30);
        rec.setWidth(-20);
        System.out.println(rec);
    }
}