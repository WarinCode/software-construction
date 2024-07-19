package Lab02;
import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your score: ");
        String grade = "";
        int score = sc.nextInt();

        if (score >= 80 && score <= 100) grade = "A";
        else if (score >= 75 && score <= 79) grade = "B+";
        else if (score >= 70 && score <= 74) grade = "B";
        else if(score >= 65 && score <= 69) grade = "C+";
        else if(score >= 60 && score <= 64) grade = "C";
        else if(score >= 50 && score <= 59) grade = "D+";
        else if(score >= 40 && score <= 49) grade = "D";
        else if (score <= 39) grade = "F";

        System.out.println("Your grade is " + grade);
    }
}
