package HW03;
import java.util.Scanner;

public class InputNames {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String fullname = sc.nextLine();

        int indexOfWhitespace = fullname.indexOf(" ");
        String firstname = fullname.substring(0, indexOfWhitespace);
        String lastname = fullname.substring(indexOfWhitespace + 1, fullname.length());

        String temp = "";
        for(int i = 0; i < lastname.length(); i++){
            if(lastname.charAt(i) != ' '){
                temp += lastname.charAt(i);
            }
        }
        lastname = temp;

        System.out.println("My name is " + firstname);
        System.out.println("My lastname is " + lastname);
    }
}
