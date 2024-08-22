package HW06;
import java.util.Scanner;

public class InputNumber {
    public static void main(String []args){
        int number = 0;
        boolean isInteger = false;
        Scanner sc = new Scanner(System.in);

        while(!isInteger){
            System.out.print("Enter a number: ");
            try {
                number = Integer.parseInt(sc.next());
                isInteger = true;
            } catch(NumberFormatException e){
                System.out.println("Please enter a integer number only!");
            } finally {
                if(isInteger) {
                    System.out.println("The integer number is " + number);
                }
            }
        }
    }
}
