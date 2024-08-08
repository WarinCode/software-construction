package HW05;
import java.util.Scanner;

public class Circle {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius: ");
        double radius = sc.nextDouble();
        double circleArea = Math.PI * Math.pow(radius, 2);
        System.out.printf("Circle area is %,.2f", circleArea);
    }
}
