package SoftwareConstruction.lab01;
import java.util.Scanner;

public class FirstJava {
    public static void main(String []args){
        Scanner input = new Scanner(System.in);
        try {
            System.out.print("Enter a num1: ");
            int num1 = input.nextInt();
            System.out.print("Enter a num2: ");
            int num2 = input.nextInt();
            double result = (double)num1 / (double)num2;
            System.out.println("The result is " + result);
        } catch(Exception e){
            e.printStackTrace();
        } finally {
            input.close();
        }
    }
}