package HW04;
import java.util.Scanner;

public class InputNames {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name : ");
        String fullname = sc.nextLine().trim();

        String []strings = fullname.split(" ");
        String firstname = strings[0];
        String lastname = strings[1];
        System.out.println("My name is " + firstname);
        System.out.println("My lastname is " + lastname);
    }
}