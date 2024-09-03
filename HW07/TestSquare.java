package HW07;
import java.util.Scanner;
import HW07.Square;

public class TestSquare {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        Square square = new Square();

        while(square.getSide() <= 0){
            try {
                System.out.print("Enter the side number of the square:");
                square.setSide(Integer.parseInt(sc.next()));
                if(square.getSide() <= 0) {
                    throw new Exception("Please enter only integer numbers!");
                }
            } catch(NumberFormatException e){
                System.out.println(e.getMessage());
            } catch(Exception e){
                System.out.println(e.getMessage());
            }
        }

        square.calculate();
        int result = square.getArea();

        System.out.printf("The result of the area square is %d", result);
        System.out.println();
    }
}
